package 매개변수람다식;
@FunctionalInterface   // 함수형 프로그래밍을 만들기 위한 어노테이션
interface MyFuncInterface {  // 인터페이스 자체가 함수를 위해 존재 하기 때문에 메소드를 하나 더 추가하면 에러. 내부에 함수가 딱 1개만 존재 할 수 있다.
    void method(int x);
}
@FunctionalInterface  // 리턴 값이 있는 람다식
interface MyFuncInterface2 {
    int min(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFuncInterface fi = x -> {   // 매개변수가 한개인 경우는 ()소괄호 생략 가능
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(10);
        MyFuncInterface2 fi2 = (x, y) -> x < y ? x : y;  // 구현부가 한 줄인 경우에는 {}중괄호 생략 가능 return 생략가능, 함수를 매개 변수로 넣을 수 있다.
        System.out.println(fi2.min(3,4));
    }
}
