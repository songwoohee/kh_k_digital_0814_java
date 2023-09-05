package 텍스트파일읽기;

public class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int mat;
    public int total() {
        return kor + eng + mat;
    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    @Override
    public int compareTo(Student o) {
        if (this.total() < o.total()) {
            return 1;
        } else if (this.total() > o.total()){
            return -1;
        } else {  // 동점이면 ? > 이름 오름차순
            return this.name.compareTo(o.name);
        }
    }


}
