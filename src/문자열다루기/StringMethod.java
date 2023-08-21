package 문자열다루기;
// 자바는 문자열을 나타내는 자료형은 String이며, 참조 타입 자료형 입니다.
// equals : 두개의 문자열이 동일한 지 비교하여 결과값을 리턴함(true | false), == 문자열의 주소가 같은지를 물어봄
// indexOf : 문자열에서 특정 문자가 시작되는 인덱스를 반환
// contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 확인
// charAt : 문자열에서 특정 위치의 문자를 반환
// replaceAll : 문자열중에서 특정 문자열을 다른 문자열로 변경, 문자열과 정규식(규칙)을 같이 바꿀 수 있다. (문자열 > 문자열&규칙)
// replace : 단순 문자열만 변경 (문자열 > 문자열)
// substring : 문자열 중 특정 부분을 뽑아 낼 때 사용 (1. 시작 인덱스만 주는 경우 2. 시작과 끝을 주는 경우)
// toUpperCase/toLowerCase : 문자열 전부를 대문자/ 소문자로 변경하는 메소드
// trim : 문자열 앞뒤의 공백을 잘라냄
// split : 문자열을 특정 구분자로 분리하는 메소드
// toCharArray() : 문자열을 문자 배열로 변환

public class StringMethod {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "Hello";
        String d = new String("hello");

        System.out.println(a.equals(d));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c)); // 문자열을 비교하는데 대소문 구분 안함
        System.out.println(a.indexOf("l")); // 문자가 시작되는 인덱스 반환
        System.out.println(a.contains("java"));
        System.out.println(a.charAt(4));
        String e = "Hello java";
        System.out.println(e.replaceAll("java","Python..."));
        System.out.println(e.substring(4,7));
        System.out.println(e.toUpperCase()); // 대문자
        System.out.println(e.toLowerCase()); // 소문자
        String oldStr = "             자바 프로그래밍      ";
        System.out.println(oldStr.trim());

        String time = "10:23:45";
        String[] modifyTime = time.split(":");
        for(String eee : modifyTime) System.out.println(eee + " ");

        // 문자열 포맷팅은 출력을 위해서 사용
        System.out.printf("I eat %d apples.", 3);
        System.out.println();

        String test = String.format("I eat %d apples.", 3);
        System.out.println(test);

        String testName = "James";
        char[] chName = testName.toCharArray();
        for(char ee : chName) System.out.print(ee + " ");


        // 출력
//        true
//        false
//        true
//        2
//        false
//        o
//        Hello Python...
//        o j
//        HELLO JAVA
//        hello java
//        자바 프로그래밍.
//        10 23 45
//        I eat 3 apples.
//        I eat 3 apples.
//        J a m e s

////
        // System.out.println(a.indexOf("lt"));
        // 없는 값을 넣으면 -1이 출력
    }
}
