package 텍스트파일읽기2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

/*
1. 임의의 위치에 텍스트 파일을 만들고, 10명의 정보를 공백 기준으로 미리 입력 해둠.
2.  해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같은 경우 이름순)
 */
public class TextReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> treeSet = new TreeSet<>();
        FileInputStream fis = new FileInputStream("src/텍스트파일읽기2/score");
        Scanner sc = new Scanner(fis);
        while (sc.hasNext()) {  // 다음라인이 있는동안 계속 읽어 = 참
            String[] lineSplit = sc.nextLine().split(" "); // 안유진 99 78 45
            treeSet.add(new Student (lineSplit[0] ,
                         Integer.parseInt(lineSplit[1])
                            + Integer.parseInt(lineSplit[2])
                            + Integer.parseInt(lineSplit[3])));
        }
        for(Student e: treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
