package Object클래스;
/*
toString() :  해당 인스턴스에 대한 정보를 문자열로 반환
클래스이름@해시코드 (객체의 메모리 주소를 이용해 해시 코드 생성, 해시 코드 가지고는 메모리 주소 추척 불가 )
ex. Object클래스.Car@2133c8f8 > Car@2133c8f8 요 부분이 해시코드
toString() 메소드는 오버라이딩해서 사용 가능 하며 String, Integer의 경우에는 오버라이딩 되어 있음.
> 그래서 출력 하면 곰돌이사육사, 2300 와 같이 주소가 아니라 글자가 그대로 출력 (오버라이딩해서 기능을 그대로 구현)

 */

import 시스템출력.SystemOut;

public class Objectclass {
    public static void main(String[] args) {
        Car car01 = new Car();
//        Car car02 = new Car();
//        System.out.println(car01.toString());
//        System.out.println(car02.toString());
//        String test = "곰돌이사육사";
//        Integer test2 = 2300;
//        int test3 = 4500;
//        System.out.println(test.toString());
//        System.out.println(test2.toString());
//        System.out.println(test3);
        Car car02 = car01;

        // equals() 메소드 : 인스턴스를 매개변수로 전달 받는 참조 변수와 비교하여 그 결과를 반환
        System.out.println(car01.equals(car02));  // 출력 false (메모리 주소가 상이하니까, 메모리 주소가 같으면 true)
    }
}

class Car {

}