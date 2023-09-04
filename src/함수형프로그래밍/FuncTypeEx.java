package 함수형프로그래밍;
/*
함수형 프로그래밍은 자바8에서 도입
자료 처리를 수학적 함수의 계산으로 취급 하고 상태와 가변 데이터를 멀리하는 프로그래밍 패러다임.
 */

//객체 지향 코드로 만들기
interface Calculator {
    int sum(int a, int b);
}
//class MyCalcurator implements Calculator {
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

public class FuncTypeEx {
    public static void main(String[] args) {
//        MyCalcurator mc = new MyCalcurator();
//        int result = mc.sum(13,17);
        Calculator mc = (int a, int b) -> a + b;    // 위 식을 람다식으로 변환 하기 > 인터페이스 상속을 받아 클래스 대신 람다식을 사용
        int result = mc.sum(13,17);
        System.out.println(result);

    }
}