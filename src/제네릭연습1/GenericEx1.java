package 제네릭연습1;
/*
멀티 타입 파라미터
 */
public class GenericEx1 {
    public static void main(String[] args) {
//        Person<String> p1 = new Person<>("안유진");
//        System.out.println(p1.info);
//        Person<Integer> p2 = new Person<>(21);
//        System.out.println(p2.info);
        Product<String,Integer> pr1 = new Product<>();
        pr1.setName("스마트TV");
        pr1.setYear(2023);
        System.out.println(pr1.getName() + " " + pr1.getYear());

        Product<Integer, String> pr2 = new Product<>();
        pr2.setName(1234567);
        pr2.setYear("2023");
        System.out.println(pr2.getName() + " " + pr2.getYear());



    }
}

class Product <T, M> {  // 꼭 T,M 이 아니라 원하는걸로 넣어도 가능
    private T name;
    private M year;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public M getYear() {
        return year;
    }

    public void setYear(M year) {
        this.year = year;
    }
}



class Person <T> {    // 'T'를 타입 변수(type variable)라고 하며, 임의의 참조형 타입을 의미, int든 string 이든 객체 타입은 아무 변수나 대입 가능.
    public T info;
    Person(T info) {
        this.info = info;
    }
}