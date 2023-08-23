package 오버로딩;
// 같은 이름의 메소드를 중복하여 정의 하는 것.
// 메소드의 이름이 같아야 한다.
// 매개변수의 개수 또는 타입이 달라야 한다.
// 반환 타입이 다른 경우는 오버로딩이 성립 하지 않는다.
public class Overloading {
    public static void main(String[] args) {
        System.out.println(sum(100,200));
        System.out.println(sum("100",200));
        System.out.println(sum(100, 200, 300));
    }
    static int sum(int x, int y) {
        return x + y;
    }
    static String sum(String x, int y) { // 매개 변수의 타입이 다르므로 오버로딩이 성립함.
        return x + y;
    }
    static int sum(int x, int y, int z) { // 매개 변수의 개수가 다르므로 오버로딩이 성립함.
        return x + y + z;
    }
//    static double sum(int x, int y, int z) { // 반환 타입이 오버로딩 조건에 포함되지 않음.
//        return x + y + z;  // 매개변수는 같은데 반환 타입이 다른 경우는 오버로딩이 성립하지 않습니다.
//    }
}
