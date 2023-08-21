package 배열의복사;
// 자바의 배열은 한 번 선언 하면 크기를 변경할 수 없다. (정적)
// 배열의 크기를 변경 하기 위해서는 더 큰 배열을 만들고 기존 배열의 데이터를 옮겨 담아야 한다.
// arraycopy() : System.arraycopy(Object src(시작), int srcPos(시작위치), Object dest(목적지), int destPos(어디서부터 채워넣을거냐), int length);
// copyOF() : 배열을 원하는 길이 만큼 새로운 배열로 복사

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int newLen = 10;
//        int[] arr2 = new int[newLen];
//        System.arraycopy(arr1,0,arr2,0,arr1.length);
//        for (int e : arr2) System.out.print(e + " ");
        int[] arr3 = Arrays.copyOf(arr1, 10);
        for(int e : arr3) System.out.print(e + " ");

        }
    }

