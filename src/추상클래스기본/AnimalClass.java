package 추상클래스기본;
/*
1. 추상클래스는 클래스 앞에 abstract 키워드를 붙여서 만든다
2. 추상클래스는 객체화 안됨
3. 내부에 0개 이상의 추상 메소드가 포함 되어 있음.
4. 추상메소드는 상속 받는 클래스에서 오버라이딩 해줘야함 (해당 메소드의 기능을 구체화 시킴)
최소한의 인터페이스만 있어야 한다. 너무 밀접한 관계를 가지게 되면 상대방의 기능이 바뀌면 나도 바뀌게 될 수 있다.
느슨한 결합 관계가 필요 !
 */
public abstract class AnimalClass {
    abstract void cry();  // 추상 메소드 : 상속 받은 클래스에서 구체화를 해줘야 함 (오버라이딩)
    void sleep () {  // 일반 메소드
        System.out.println("zzzzzz");
    }
}    // cry라는 이름만 정의 해준것.(추상화, 실제 행동을 부여하는 건 없다) 추상메소드와 일반메소드(sleep) 함께 존재 가능

class Cat extends AnimalClass {
    @Override   //  반드시 오버라이딩 해줘야 한다.
    void cry() {
        System.out.println("냐옹냐옹 ! ");
    }
    @Override
    void sleep() {
        System.out.println("ZZZZZZZZ");
    }
}
class Dog extends AnimalClass {

    @Override
    void cry() {
        System.out.println("멍멍멍");
    }
}
