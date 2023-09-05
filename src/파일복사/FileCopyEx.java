package 파일복사;

import java.io.*;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사/곰돌이.png";   // 현재 파일 저장 위치
        String targetFileName = "d:/tmp/bear.png";    // 원하는 저장 위치

        FileInputStream fis = new FileInputStream(originFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {  // readBytes 한번에 100 바이트씩 읽어낸다
            fos.write(readBytes, 0, readByteNo);   // 맨 앞에서부터 100바이트까지 읽어줘
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
