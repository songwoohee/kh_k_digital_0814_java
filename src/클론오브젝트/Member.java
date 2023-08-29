package 클론오브젝트;
/*
얕은 복사랑 단순이 필드값만 복사해서 객체를 복제하는 것
clone() 메소드는 데이터의 보호를 이유로 **Cloneable 인터페이스를 구현한 클래스의 인스턴스만이 사용** 할 수 있습니다.
 */
public class Member implements Cloneable{
    String id;
    String name;
    String password;
    int age;
    boolean adult;

    void viewInfo() {
        System.out.println("ID " + id);
        System.out.println("이름 " + name);
        System.out.println("비밀번호 " + password);
        System.out.println("나이 " + age);
        System.out.println("성인 " + adult);

    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;

    }
    public Member getMember() {   // 반환타입이 멤버, 내가 지금 만들고 있는 클래스가 멤버임
        Member cloned = null;
        try {
            cloned = (Member) clone();   // 클론 메소드 자체는 object class 타입이므로 형변환.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  cloned;
    }
}
