package 추상클래스기본;

public class AnimalMain {
    public static void main(String[] args) {
//        AnimalClass animalClass = new AnimalClass() {  // 오버라이딩 없이 객체화 안됨
//            @Override
//            void cry() {
//
//            }
//        }
        Cat cat = new Cat();
        cat.cry();
        cat.sleep();

        Dog dog = new Dog();
        dog.cry();
        dog.sleep();

        // 추상 클래스의 참조 변수로 상속 객체를 접근, 자주 이용 되는 방법
        AnimalClass animal = new Cat();  // animalclass는 실체는 없지만 상속을 줬기 때문에 cat과 dog를 바라볼 수 있다.
        animal.cry();
        animal.sleep();

    }
}
