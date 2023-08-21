package 중복없는로또번호;
// 1 ~ 45 사이의 임의의 수 6개를 생성 해야 함. (입력은 받지 않음, Math.random() -> 0.1 ~ 0.999 )
// int val = (int) ((Math.random() * 45) + 1);
// 단 중복 제거
// 생성된 val 값을 배열에 담을 때 배열 내에 해당하는 값이 있는지 확인 필요.
// 배열은 6개
// 반복 횟수는 정할 수 없음 (무한 while(true) == 탈출 조건(중복되지 않은 번호가 6개 저장 되면 break;)
public class RandomLotto {
    public static void main(String[] args) {
       int [] lotto = new int[6];
       int tmp, index = 0; // 임시 로또 번호
        boolean isExist = false; // 중복값을 없애려고


       while(true) {
           tmp = (int) ((Math.random() * 45) + 1);
           for (int i = 0; i < lotto.length; i++) {
               if(lotto[i] == tmp) isExist = true; // 중복된 값이 있다는거
           }
           if(!isExist) lotto[index++] = tmp;
           if(index == 6) break;
           isExist = false;
       }
       for(int e : lotto) System.out.print(e + " ");
    }
}
// 출력
// 5 11 14 44 39 13
