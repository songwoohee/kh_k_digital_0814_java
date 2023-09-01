package 쓰레드예제2번;
import static java.lang.Thread.sleep;
/*
다른 쓰레드의 종료를 기다림 (Join())
 */
public class ThMainEx2 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try{
            sumThread.join(100);  // sumThread 가 작업을 완료할 때까지 기다림
            System.out.println("main이 일을 하는지 확인???");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("합 : " + sumThread.getSum());

    }
}

class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    @Override
    public void run() {
        for(int i = 0; i <= 2100000000; i++) {
            sum += 1;
        }
    }
}