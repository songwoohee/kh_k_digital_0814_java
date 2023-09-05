package 텍스트파일읽기;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Stream;

/*
1. 임의의 위치에 텍스트 파일 생성. 10명의 정보를 공백 기준으로 미리 입력.
2. 이름 국어 영어 수학 순
3. 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기
 */
public class ScoreMain {
    public static void main(String[] args) throws IOException {
        // 1. 파일 내용을 소스로 하는 스트림 생성
//        Path path = Paths.get("src/텍스트파일읽기/학생성적표.txt");
//        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
//        stream.forEach(x -> System.out.println(x));
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기/학생성적표.txt");
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String[] lineSplit = sc.nextLine().split(" ");
            treeSet.add(new Student(lineSplit[0],
                    Integer.parseInt(lineSplit[1]),
                    Integer.parseInt(lineSplit[2]),
                    Integer.parseInt(lineSplit[3])));
        }

        for(Student e : treeSet) {
            System.out.println(e.name + " : " + e.total());
        }

    }
}
