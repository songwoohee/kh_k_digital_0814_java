package 바이트스트림;
/*
OutputStream : 바이트 기반 출력 스트림의 최상위 추상 클래스 / 1 Byte 단위로 입력, 출력 하는 스트림
 */
import java.io.*;

public class ByteStreamEx {
    public static void main(String[] args) throws IOException {
//        OutputStream os = new FileOutputStream("test.bin");
//        byte a = 10;
//        byte b = 20;
//        byte c = 30;
//        os.write(a);
//        os.write(b);
//        os.write(c);


        OutputStream os = new FileOutputStream("test2.bin");
        byte[] array = {10, 20, 30};
        os.write(array);

//        OutputStream os = new FileOutputStream("test3.bin");
//        byte[] array = {10, 20, 30, 40, 50};
//        os.write(array, 1, 3); // 배열의 1번 인덱스부터 3개 출력

//        os.flush();  // 버퍼 비우기
//        os.close();  // 자원 반납 후 스트림 닫기 , 닫기 안하면 자원이 그냥 날라감.


        // 읽을 때는 버퍼 비우기가 필요 없다. flush
        // 읽기 1번째 방법
        InputStream is = new FileInputStream("test3.bin");
//        while(true) {
//            int data = is.read();  // 1바이트씩 읽음
//            if(data == -1) break;  // 더 이상 읽을것이 없으면 -1 이 들어온다. 즉, 파일의 끝
//            System.out.println(data);
//        }
        byte[] buffer = new byte[100];
        // 2번째 방법
        while(true) {
            int readNum = is.read(buffer);   // 배열의 길이 만큼 읽기 , 위에 배열의 길이를 만들어줌 > byte[] buffer = new byte[100];
            if(readNum == -1) break;
            for (int i = 0; i < readNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
