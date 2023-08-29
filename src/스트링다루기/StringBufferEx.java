package 스트링다루기;
/*
StringBuffer(동기화 지원), StringBuilder(동기화 지원 하지 않음) 둘 자 문자열 추가 하거나 변경 할 때 사용
객체를 하나 생성 하고 기능을 한다. 같은 영역에서 추가해 나감. > 길게 구현 할 때 유용
String은 만들때마다 새로 추가 됨. 10개 추가 하면 10개가 만들어지는 것
String 자료형과 어떤 차이가 있는지만 이해 하면 됨, 언제 어떤걸 사용할거냐만 알면 됨
 */
public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("java");
        System.out.println(sb);
        // 출력 hello java

        String st = "";  // = String st = null;  둘 다 초기화 시키는 방법
        st += "hello";
        st += " ";
        st += "java";
        System.out.println(st);
        // 출력 hello java

        StringBuilder sb2 = new StringBuilder();
        sb2.append("jump to java");
        // insert : 해당 offset에 문자열을 추가
        sb2.insert(0,"hello ");
        System.out.println(sb2);
        // delete : 지우고 싶은 글자의 인덱스를 넣어 삭제
        sb2.delete(7,10);
        // substring : 출력하고 싶은 부분의 인덱스를 넣어 해당 부분만 출력
        System.out.println(sb2.substring(0,4));



    }
}

