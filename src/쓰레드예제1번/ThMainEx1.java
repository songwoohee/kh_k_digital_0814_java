package 쓰레드예제1번;
/*
하나의 프로그램 내에서 여러 가지 일을 동시에 수행 하는 것.
 */
public class ThMainEx1 {
    // Thread 클래스 상속 받아서 Thread 생성
    public static void main(String[] args) {
        Thread testTh = new CustomThread();
        testTh.start();   // 운영 체제한테 시작 해달라고 요청. > 이후 run을 호출 해줌
        System.out.println("Main에서 찍어 봅니다.");

        // Runnable 인터페이스를 상속 받아서 쓰레드를 만드는 방법
        Runnable runTask = new InterThread();   // 객체를 생성, 실제 작업을 내용을 가지고 있지만 실제 쓰레드는 아님
        Thread runTh1 = new Thread(runTask);   // 위에 인터페이스를 상속 받았기 때문에 해당 부분 처럼 쓰레드로 한번 더 생성 해줌
        Thread runTh2 = new Thread(runTask);   // 위에 인터페이스를 상속 받았기 때문에 해당 부분 처럼 쓰레드로 한번 더 생성 해줌
        runTh1.start();  // 상속 받은 쓰레드 시작 해달라고 요청
        runTh2.start();


        // 익명 객체로 쓰레드를 만드는 방법
        Runnable task = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
                    System.out.println("인터페이스 : " + sum);
            }
        };
        Thread anonyTh1 = new Thread(task);
        anonyTh1.start();

        // 람다식으로 쓰레드를 만드는 방법
        Runnable task2 = () -> {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("인터페이스 : " + sum);
        };
    }

}
// 상속 받아서 쓰레드를 만드는 방법
class CustomThread extends Thread { // Thread 를 통해 상속
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("상속받은 쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
class InterThread implements Runnable {   // Runnable 인터페이스를 통해 상속

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}