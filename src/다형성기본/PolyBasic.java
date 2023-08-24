package 다형성기본;

public class PolyBasic {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        child.out();
        child.display();
        parent.display();

        Parent p = new Child();  // 부모 클래스의 참조 변수로 자식 객체를 접근 함.
        p.display(); // display() 어느게 불려진걸까? child display 임. 오버라이딩 된게 우선 !!
                    // 부모가 자식 객체에 접근한 것. > 오버라이딩이 이렁나 자식 메소드가 불려옴


    }
}