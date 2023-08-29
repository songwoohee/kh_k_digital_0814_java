package 다중인터페이스;

public class Car {   // 인스턴스 변수들
    protected int speed;  // 상속 관계가 성립되면 접근 가능 , 또는 같은 패기지 내에서 이용 가능
    protected String color;
    protected String year;
    public Car() {
        speed = 150;
        color = "white";
        year = "1999";
    }

}
