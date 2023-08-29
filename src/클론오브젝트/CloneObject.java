package 클론오브젝트;
/*
얕은 복사가 필요한 경우에 클론이 필요 하다

 */

public class CloneObject implements Cloneable{
    public static void main(String[] args) {
        Member mem1 = new Member("dog","두부","1234567",20,true); // mem1 객체 생성
        Member mem2 = mem1;   // 얕은 복사가 일어나는 조건
        mem1.viewInfo();
        mem2.name = "런이";
        mem2.password = "1111111";
        mem2.viewInfo();
        mem1.viewInfo();


    }
}
