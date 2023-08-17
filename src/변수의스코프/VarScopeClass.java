package 변수의스코프;

public class VarScopeClass {
    public static void main(String[] args) {
        // 문자 자료형 : 자바는 유니코드를 사용 (2바이트로 전세계의 모든 문자를 표시) 앞의 1바이트는 ASCII와 동일
        char ch = 'A'; // 자바에서 문자는 작은 따옴표를 사용, A라는 문자 하나라는 뜻, 실제 저장은 정수값으로 저장됨

//        System.out.println(ch);
//        System.out.println((int)ch); //명시적으로 형을 int형으로 변경함

        char ch2 = 66; // char형은 음수가 올 수 없음
//        System.out.println(ch2);
//        System.out.println((int)ch2);

        // 실수 자료형 : float(4Byte, 32bit), double(8파이트) , 근사치 계산법
//        float height = 175.5f;  //숫자 뒤에는 꼭 f 를 붙여서 사용
//        double pi = 3.141592653589;
        double num1 = 0.1;
        for(int i = 0; i<1000; i++) {
            num1 += 0.1;
        }
        System.out.println(num1);



    }
}
