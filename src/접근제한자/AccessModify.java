package 접근제한자;

import 인스턴스필드.Parent;

//
public class AccessModify {
    public static void main(String[] args) {
//        Restrictor restrictor = new Restrictor();
//        restrictor.seoul();  // public 메소드에 대한 접근
//        restrictor.busan();  // protected 메소드에 대한 접근, 같은 패키지 이거나 상속 관계가 있으면 접근 가능.
//        restrictor.daegu();  // default 메소드에 대한 접근, 같은 패키지 내에서만 접근 가능
//      //  restrictor.incheon(); > private 메소드에 대한 접근으로 사용 불가 (같은 클래스 안에서만 사용 가능하나 클래스가 달라 접근 허용 안됨)
        Child child = new Child("엔지니어");
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());


    }
}

class Child extends Parent {
    String jobs;
    public Child (String jobs) {
        this.jobs = jobs;
    }
    public String getMoney() {
        return money;
    }
    public String getName() {
        return name;
    }
    public  String getAddr() {   // protected 다른 패키지에 있어도 상속 관계이면 접근 가능.
        return addr;
    }
}