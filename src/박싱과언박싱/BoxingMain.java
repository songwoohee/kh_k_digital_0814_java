package 박싱과언박싱;

public class BoxingMain {
    public static void main(String[] args) {
        Integer num = 12;  // 오토 박싱 > 기본형태 안써도 알아서 박싱해준다.
//        Integer num = new Integer(12);  // 기본 형태
//        System.out.println(num);

        Character ch = 'x';  // 오토 박싱
        char c = ch;         // 오토 언박싱
        System.out.println(c);
    }
}
