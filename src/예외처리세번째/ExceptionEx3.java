package 예외처리세번째;
/*
NullPointException (NPE)
Java에서 발생 하는 대표적인 런타입 에러. 참조 하려는 객체가 없는 경우에 발생
 */
public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

        if (test != null) {
            String testStr = test.name;  // 인스턴스화가 안됨
            System.out.println(testStr);
        } else {
            System.out.println("testStr null 입니다. ");
        }

    }
}

class Test {

    String name = "밤비";
}
