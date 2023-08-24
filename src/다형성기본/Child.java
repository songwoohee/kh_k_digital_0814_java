package 다형성기본;

public class Child extends Parent{
    private int x = 100;
    public Child() {}  // public 을 붙이지 않거나 private 를 붙이면 접근 제한이 생김 > 객체를 못 만든다.
    public void out() {
        System.out.println("부모의 protected num 필드 : " + num);
        System.out.println("자식 클래스 메소드");
    }

    @Override
    public void display() {
        System.out.println("상속 받아 재정의한 메소드");
    }
}
