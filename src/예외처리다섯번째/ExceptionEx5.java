package 예외처리다섯번째;
/*
예외 처리 미루기
 */

import java.io.IOException;
public class ExceptionEx5 {
    public static void main(String[] args) {
        IOSample test = new IOSample();
        try {
            test.input();
        } catch (IOException e) {
            System.out.println("입력 에러 발생...");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }
}

class IOSample {
    private int num;
    public void input() throws IOException {   // 여기서 catch ~ try 예외 처리 안하면 main에서 해줘야 한다. 여기선 오류를 throws 처리해서 미룸.> 메인으로 예외처리 미루기
        num = System.in.read();  // 단순 문자를 입력 받는 기능. scanner 저수준 입력 모드.
    }
    public void output() {
        System.out.println(num);
    }
}