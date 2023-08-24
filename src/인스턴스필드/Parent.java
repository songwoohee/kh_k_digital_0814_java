package 인스턴스필드;

public class Parent {
    public String name;
    String money;   // default는 같은 패키지내에 있어야 접근 가능. 다른 패키지로 옮기면 접근 불가
    protected String addr;
    public Parent() {
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }
}
