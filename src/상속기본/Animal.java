package 상속기본;

public class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
// Animal을 상속 받아 Dog 클래스를 만듬
class Dog extends Animal {
    void sleep() {
        System.out.println(this.name + " zzz");
    }

}
// 같은 sleep이 있지만 마지막 sleep이 오버로딩(출력) 됨, 만약 마지막 sleep을 막으면 기존 부모 특성이 출력됨
class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour) {  // 같은 클래스명에 매개변수를 넣어주어 조건을 추가해줄 수 있다. ex. hour
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}