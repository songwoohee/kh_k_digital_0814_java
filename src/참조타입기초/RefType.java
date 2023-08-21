package 참조타입기초;
// 자바의 데이터 타입은 기본 타입과 참조 타입으로 나누어 진다.
// 기본 타입은 실제 값이 변수에 저장 됩니다. (정수, 실수, 문자, 논리값)
// 참조 타입은 객체의 주소를 변수에 저장 합니다. (배열, 열거형, 인터페이스, 클래스, 문자열)
public class RefType {
    public static void main(String[] args) {
        // 기본 타입
//        int age = 25; // int형으로 만들어진 age라는 변수에 25라는 값을 저장.
//        double price = 100.5; // double형으로 만들어진 price 변수에 100.5 라는 값을 저장.
//        // 참조 타입
//        String name = "곰돌이사육사"; //String형으로 만들어진 name에는 실제 "곰돌이사육사"라는 문자열이 없고 주소가 있음.
//
//       // int unbox = 0; // int형의 기본 타입이므로 값을 대입 해야 함.
//        Integer boxedValue = null; // int형에 대한 참조 타입
//        // String 처럼 앞에 대문자 >  객체 타입, 실제 값이 아닌 주소가 들어 있다.
//        int intvalue = boxedValue;
//        System.out.println(intvalue);
//        // 출력 NullPointException > 실제 값이 없는데 찾으려하니 오류가 뜸 (주소만 가지고 있다.)
//

        String strVal1 = "나희도"; // 리터럴 상수로 고정됨
        String strVal2 = "나희도";
        String strVal3 = new String("나희도"); // heap 영역에 메모리 공간을 확보함

        // 참조 변수에서 ==,!= (주소가 같은지를 물어보게 됨)
        if (strVal1 == strVal2) { //주소가 같은지 물어봄
            System.out.println("strVal1과 strVal2는 참조 하는 주소가 같음");
        } else {
            System.out.println("strVal1과 strVal2는 참조 하는 주소가 다름");
        }

        if (strVal1.equals(strVal2)) { // 포함된 내용, 즉 문자열이 같은지 물어봄. 실제 내용이 같으니 물어보는거
            System.out.println("strVal1과 strVal2의 내용이 같음");
        }
        // 출력
        // strval 1 == strval2 같다 나옴
        // strval 1 != strval3 다르다 나옴
    }
}
