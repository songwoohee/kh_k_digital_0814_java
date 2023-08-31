package 컴페어러블;

import java.security.PublicKey;

public class CarComp implements Comparable<CarComp>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    /*
    반환 값이 1이면 정렬
    반환 값이 -1 이면 정렬 조건 아님
    반환 값이 0이면 정렬 조건은 아니지만 set을 사용 하는 경우 중복 제거 조건이 됨
     */
    public int compareTo(CarComp o) {
       if(this.modelYear > o.modelYear) return 1;  // 연식별 오름차순 정렬
        else {
            if(this.modelYear == o.modelYear) {
                return this.color.compareTo(o.color);  // 사전 순 정렬
            }
       }
        return -1;
    }
}
