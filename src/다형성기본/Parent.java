package 다형성기본;

public class Parent {
    protected int num; // protected > 상속 관계가 있거나 같은 패키지내에서 접근 가능.
                       // 패키지(파일)가 달라지면 안됨, 그럼 앞에 아무것도 안붙이거나 public
    int money =  10000000;
    public void display () {
        System.out.println("부모 클래스 메소드");
    }
}
