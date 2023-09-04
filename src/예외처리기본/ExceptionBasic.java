package 예외처리기본;
/*
try{
// 예외 발생 가능성이 있거나, 예외를 반드시 처리해야 하는 코드 작성부
} catch (처리할 예외클래스명 객체 1) { // 예외 상황 1에 대한 처리 코드
} catch (처리할 예외클래스명 객체 2) { // 예외 상황 2에 대한 처리 코드
} finally {
// 예외 발생으로 try{} 안의 코드가 중단되더라도 반드시 실행해야 하는 코드
}
 */
public class ExceptionBasic {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("배열의 인덱스를 초과 했습니다. 값을 확인해 주세요 !");
        }
        System.out.println("프로그램 끝");
    }
}
