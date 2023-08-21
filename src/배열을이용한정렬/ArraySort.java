package 배열을이용한정렬;
// 1차원 배열을 이용한 기본 정렬 (버블 정렬 / 삽입 정렬)
// 사용 예시의 버블 정렬은 일반 적인 방법과 약간의 차이가 있음
// 기본적인 버블 정렬이나 삽입 정렬은 시간의 복잡도를 나타내는 빅오표기법으로 표시하면 0(n2) / 효율은 나쁘다
// 면접시 나오는 문제라 알아둬야 함
public class ArraySort {
    public static void main(String[] args) {
        int [] arr = {9,4,3,10,5,8,7,6,2,1};
        int tmp = 0; // 정렬을 위한 임시 공간
        for (int i = 0; i < arr.length; i++) { // i는 0부터 시작
            for (int j = i; j < arr.length; j++) { // j는 i값부터 시작하니 마찬가지로 0부터 시작
                if(arr[i] > arr[j]) { // 처음엔 같은 값을 바라 보기 때문에 그냥 넘어감, 2바퀴째는 i = 9, j는 그 다음으로 넘어 가서 4 값을 가지고 있음. 그러니 i가 j보다 크다 성립.
                    tmp = arr[j]; // 위에 성립 했으니 4값을 tmp에 저장. tmp가 있어야만 기존값을 여기로 저장해두고 계속 바퀴를 돌 수 있음.
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.print(e + " ");
    }
}
