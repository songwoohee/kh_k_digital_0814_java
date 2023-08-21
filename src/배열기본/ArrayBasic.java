package 배열기본;
// 자바의 배열은 동일한 데이터 요소들을 연속적으로 저장하는 자료 구조.
// 인덱스를 사용해서 각 요소를 접근할 수 있습니다. (인덱스는 0부터 시작)
// 배열은 크기를 먼저 지정 해야 합니다.
// 타입[] 배열 이름 = new 타입[배열 길이]
public class ArrayBasic {
    public static void main(String[] args) {
        // 배열의 크기를 할당하고 이후에 초기화 하는 방법
        int[] grade1 = new int[3]; //Heap 영역에서 정수 3개를 저장할 메모리 공간을 확보
        grade1[0] = 85;
        grade1[1] = 99;
        grade1[2] = 77;
//        for (int i = 0; i < grade1.length; i++) {
//            System.out.println(grade1[i] + " ");
//        }
//        // 위 for문 보다 향상된 for문 : 주어진 배열 등의 크기를 자동 순회를 함 / ** 향상된 for문은 요소의 값을 변경할 수 없음 **
//        for (int e : grade1) { // int e 자체가 값, 전체를 순회 하기 때문에 일부만 순회 안됨, 첨부터 끝까지다 순회함
//            System.out.println(e + " ");
//        }
//        int [] odd = {1,3,5,7,9}; // 중괄호로 묶으면 할당할 공간을 미리 확보, new 생략 가능 > 이미 정해진 값을 배열 대입 하는 경우는 크기와 new를 사용하지도 않아도 된다.
//        String[] weeks = {"월요일","화요일","수","목","금","토","일"}; // 배열 안에도 주소가 들어갈 수 있다.
//        char[] weeks = {'월','화','수','목','금','토','일'};
        // 같은 문자지만 string 과 char 은 접근 방법이 다르다

        int[] grade2 = {88, 99, 56}; // 이미 값을 알고 있는 경우
        int[] grade3 = new int[] {99, 88, 88}; //
        int[] grade4; // 객체 타입의 참조 변수 이므로 실제 객체의 주소를 받아야 함
        grade4 = new int[4];
        grade4[0] = 100;
        grade4[1] = 88;
        grade4[2] = 77;
        grade4[3] = 55;
        int sum = 0; // 총점을 구하기 위한 변수

        // 총점 구하기 1 일반 for문
//        for (int i = 0; i < grade4.length; i++) {  // length는 배열의 길이 확인
//            grade4[i] += 10;
//            sum += grade4[i];  // 총점 구하기
//        }

     // 총점 구하기2  향상된 for문
//      for(int e : grade4)  sum += e;

      // 총점 구하기 3 향상된 for문
        sum = 0;
        for (int e : grade4) {
            e += 10;
            sum += e; //총점구하기
        }

        System.out.println("총점 : " + sum);
        System.out.printf("평균은 : %.2f\n", (double)sum/grade4.length);
        // 출력
//        총점 : 320
//        평균은 : 80.00

//        for(int e : grade4){
//            System.out.println(e + " ");
//        }
        // 출력
//        100
//        88
//        77
//        55


    }
}
