package 메소드와필드;
// 메소드 : 클래스 내에서 동작에 대한 기능을 구현 하는 것. (함수가 클래스 내부에 있으면 메소드라 함)
// 필드 : 클래스 내에 존재하면 값을 저장하는 변수를 의미. (상태를 저장)
public class MethodAndField {
    public static void main(String[] args) {
        MethodAndField methodAndField = new MethodAndField();
     //   int result = MethodAndField.sum(100,200,300); // 매개 변수의 개수를 알 수 없는 경우 사용
        int result = recFunc(10);
        System.out.println(result);
    }
    // 메소드 앞에 static 을 선언하는 경우 객체 소속이 아니고 클래스 소속
    static int sum(int a, int b) {
        return a + b;
    }
    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립.
        static int sum(int a, int b, int c) {
            return a + b + c;
    }
    // 매가 변수의 개수를 알 수 없는 경우 사용
    static int sum(int...val) { // ... > 전개 연산자
        int sum = 0;
        for(int e : val) sum += e;
        return sum;
    }
    // 재귀 호출 : 메소드 자신이 자신을 호출 하는 것, 매우 어려운 문제..
    // while 문과 동일한 값이 나오는데 코드는 더 간결
    static int recFunc(int n) {
        if(n == 1) return 1;
        return n + recFunc(n - 1);
    }  // 바라는 값을 호출할 때 까지 계속 반복, 결과값 나오면 그동안 나온 값들 모두 더해서 출력 (10 + 9 + 8 +...+1 = 55)
    static int whileSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n;
            n--;
        }
        return  sum;
    }

}
