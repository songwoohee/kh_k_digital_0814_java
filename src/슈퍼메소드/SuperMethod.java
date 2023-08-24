package 슈퍼메소드;
// super : 부모의 필드나 메소드를 접근할 때 사용
// super() :  부모의 생성자를 호출

public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
   int a;
//   Parent() {
//       a = 10;
//   }
   Parent(int n) {
       a = n;
   }

}

class  Child extends Parent {
    int b;

    Child() {
        super(100);   // 부모의 생성자를 불러줌
        b = 20;
    }

    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}


//    void ChildMethod() {
//        System.out.println("x : " + x); // 자식 필드 접근
//        System.out.println("x : " + this.x); // 원래 this 숨어 있었기 때문에 위와 같은 값이 출력
//        System.out.println("x : " + super.x); // 부모의 필드 접근, 부모의 x가 출력




