package 클래스기본;

public class ClassBasic {
    public static void main(String[] args) {
        Student s1 = new Student(); //(인스턴스, 스투던트 클래스만큼 확보, s1은 객체 new Student 바라보는 참조변수 )
        System.out.println(s1.setName("밤비"));
        s1.setAddr("서울시 관악구");
        s1.showInfo();
        Student s2 = new Student();
        s2.setName("안유진");
        s2.setAddr("서울시 강남구");
        s2.showInfo();
        Student s3 = new Student();
        s3.setName("장원영");
        s3.setAddr("서울시 서초구");
        s3.showInfo();
    }

}
