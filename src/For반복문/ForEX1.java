package For반복문;
// for(초기식;조건식;증감식) { 참인 동안 수행되는 구문 }
// 주로 정해진 횟수를 반복 하는 경우에 사용됨.
public class ForEX1 {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++) {
//            System.out.printf("%4d" , i);
//            if ( i % 10 == 0) System.out.println();
//        }


            // for문 구현 2
            int i = 1;
            for(;;) {
                System.out.printf("%4d" , i);
                if ( i % 10 == 0) System.out.println();
                i++;
                if (i > 100) break;
            }

            // while로 구현

//        int i = 1;
//        while(true) {
//            System.out.printf("%4d" , i);
//            if ( i % 10 == 0) System.out.println();
//            i++;
//            if (i > 100) break;
//        }
        }
    }

