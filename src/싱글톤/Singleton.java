package 싱글톤;

public class Singleton {
    String name;
    int id;
    // 클래스 내에서 단 한 번 객체를 생성함.
    private static Singleton singleton = new Singleton();  // new ~ > 객체를 한 번 생성.
    // private > 생성자를 외부에서 호출 되지 않도록 접근 제한을 함.
    private Singleton() {
        name = "test";
        id = 100;
    }
    // 한 번 만들어진 객체에 대한 주소를 반환 함.
    static  Singleton getSingleton() {
        return singleton;
    }
}
