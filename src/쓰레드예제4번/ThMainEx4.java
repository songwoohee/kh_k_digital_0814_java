package 쓰레드예제4번;

import static java.lang.Thread.sleep;

/*
쓰레드를 안전 하게 종료 하기, stop() 메소드는 사용 중지 됨
interrupt() 사용
 */
public class ThMainEx4 {
    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();
        runThread.start();
        try {
            sleep(3000);
        } catch (InterruptedException e) {}
        runThread.interrupt();
    }
}
class RunThread extends Thread {
//    private boolean stop; // stop 플래그 설정
//    public void setStop(boolean stop) {   // 기본값이 false
//        this.stop = stop;
//    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 실행중.....");
                sleep(1);
            }
        } catch (InterruptedException e) {
            System.out.println("인터럽트 발생 !!!!!");
        }

        System.out.println("자원 정리...");
        System.out.println("실행 종료...");
    }

}