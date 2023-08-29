package 인터페이스활용;

public class InterfaceEX {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;     // customer 참조 변수를 Buy 인터페이스형에 대입
        buyer.buy();

        Sell seller = customer;
        seller.sell();
        Customer cutomer2 = (Customer) seller;  // 다운캐스팅이라 한다.
        cutomer2.buy();
        cutomer2.sell();
    }
}
