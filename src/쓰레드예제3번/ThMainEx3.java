package 쓰레드예제3번;
/*
쓰레드간의 협업 : wait(), notify(),notifyAll()
notify() : 일시 정지 상태에 있는 쓰레드를 실행 대기 상태로 변경
wait() : 자신을 일시 정지 상태로 만듬
synchronized : 멀티쓰레드 환경에서 임계 영역에 접근을 방지 하는 역할 (Lock / unlock)
한번에 한개의 스레드만 프로세스 공유 자원에 접근 할 수 있도록 락(Lock)을 걸어 다른 스레드가 진행 중인 작업을 간섭 하지 못하도록 하는 것
 */
public class ThMainEx3 {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 객체 생성
        Thread threadA = new ThreadA(sharedObject);  // 쓰레드에 객체 주입
        Thread threadB = new ThreadB(sharedObject);  // 쓰레드에 객체 주입
        threadA.start();
        threadB.start();

    }
}
class WorkObject {
    // synchronized : 멀티쓰레드 환경에서 임계 영역에 접근을 방지 하는 역할 (Lock / unlock)
    public synchronized void methodA () {
        System.out.println("Thread의 methodA() 작업 실행");
        notify();  // 일시 정지의 상태에 있는 ThreadB를 실행 대기 상태로 만듬
        try {
            wait();
        } catch (InterruptedException e) {}
    }
    public synchronized void methodB () {
        System.out.println("Thread의 methodB() 작업 실행");
        notify();  // 일시 정지의 상태에 있는 ThreadB를 실행 대기 상태로 만듬
        try {
            wait();
        } catch (InterruptedException e) {}
    }
}

class ThreadA extends Thread {
    private final WorkObject workObject;  // 외부에서 만들어서 객체를 넣어준다
    public ThreadA(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodA();
        }
    }

}
class ThreadB extends Thread {
    private final WorkObject workObject;  // 외부에서 만들어서 객체를 넣어준다
    public ThreadB(WorkObject workObject) {
        this.workObject = workObject;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            workObject.methodB();
        }
    }

}