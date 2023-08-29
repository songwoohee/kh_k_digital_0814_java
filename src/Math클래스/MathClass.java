package Math클래스;
/*
Math 클래스는 수학에서 자주 사용 하는 상수들과 함수를 미리 구현 해 높은 클래스
Math 클래스의 모든 메소드는 static 이므로 객체 생성 없이 바로 사용
java.lang 패키지에 포함 되어 있어 import가 필요 없음
random() 메소드는 0.1 - 1 미만의 임의의 double형 값을 반환
 */
public class MathClass {
    public static void main(String[] args) {
        System.out.println((int) (Math.random() * 100));  // int 를 붙이면 0 - 99

    }

}
