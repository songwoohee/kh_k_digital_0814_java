package This에대해서;

public class Car {  // 인스턴스 필드
    private String model; // 자동차명
    private int year;     // 출고 연도
    private  String color; // 색상
    private  int maxSpeed; // 최고 속도
    Car() {} // 생성자
    Car(String model) {
        this(model, 2022, "Black", 230);  // 이런 방법도 있다.
    }
    Car(String model,int year,String color, int speed) {  // 매개변수 4개를 가진 생성자, this 는 객체를 참조.
        this.model = model;   // 위 인스턴스의 model를 참조, 생략 가능 하나 매개 변수와 이름이 동일 할 경우 this를 써줘야 구분 가능. 안써주면 매개변수가 먼저.
        this.year = year;
        this.color = color;
        maxSpeed = speed;

    }
}
