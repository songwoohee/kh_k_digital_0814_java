package 디폴트메소드중복;

public interface Buy{
    void buy();  // public abstract 자동으로 추가 됨
    default void order() {   // 예외적으로 구현부를 가짐
        System.out.println("구매 주문");
    }
}

interface Sell {
    void sell();
    default void order() {
        System.out.println("판매 주문");
    }
}
class Customer implements Buy, Sell {
    @Override
    public void buy() {

    }

    @Override
    public void order() {   // 오바라이딩 제대로 안하면 어떤 메소드가 넘어왔는지 모른다. sell,buy 구분 잘해서
        Sell.super.order();
        Buy.super.order();
    }


    @Override
    public void sell() {

    }
}