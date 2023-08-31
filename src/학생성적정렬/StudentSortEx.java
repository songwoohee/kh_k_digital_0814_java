package 학생성적정렬;
/*
 미리 입력 받아 놓고 시작 > 1. 학생 리스트 클래스 따로 생성
 2. 5명의 학생에 대해 이름과 성적을 입력 성적이 높은 사람 순으로 정렬.
 성적이 같으면 이름순으로 정렬
 */

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
          TreeSet<StudentInfo> info = new TreeSet<>();
          info.add(new StudentInfo("안유진",95));
          info.add(new StudentInfo("장원영",77));
          info.add(new StudentInfo("이서",88));
          info.add(new StudentInfo("레이",77));
          info.add(new StudentInfo("가을",77));
          for(StudentInfo e : info) {
              System.out.print(e.name + " ");
          }


//        TreeSet<StudentList> list = new TreeSet<>();
//        list.add(new StudentList("민지",95));
//        list.add(new StudentList("해린",89));
//        list.add(new StudentList("다니엘",75));
//        list.add(new StudentList("하니",75));
//        list.add(new StudentList("혜인",60));
//        for(StudentList e : list) {
//            System.out.println("이름 : " + e.name + "성적 : " + e.score);
//        }
    }
}
class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.score < o.score) return 1;  // 내림차순
        else {
            return this.name.compareTo(o.name);  // 사전순정렬
        }
    }
}