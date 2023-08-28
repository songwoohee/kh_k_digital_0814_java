package 다운캐스팅;

import java.util.ArrayList;

/*
상위 클래스형으로 변환 되었던 하위 클래스를 원래 자료형으로 변환하는것을 다운 캐스팅이라고 함.
실제 자기 자료형으로 되돌아가는 것을 말함
 */
public class DownCasting {
    ArrayList<Animal> aniList = new ArrayList<>();  // ArrayList 기본 타입은 못오고 객체만.(객체 타입은 주소만 올 수 있다.animal 타입의 객체가 왔다.)
    // 리스트 형태에 주소를 집어 넣는것..?
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();  // 객체로 만들고
        downCasting.addAnimal();
        downCasting.testCasting();
    }
    public void addAnimal() {
        aniList.add(new Animal());
        aniList.add(new Human());
        aniList.add(new Tiger());
        aniList.add(new Eagle());
        for(Animal ani : aniList) {
            ani.move();
        }
    }
    public void testCasting() {
        for (int i = 0; i < aniList.size(); i++) {  // aniList.size = 4
            Animal ani = aniList.get(i);   // 업캐스팅. 해당 하는 인덱스의 값을 가져 오는 것. 해당하는 객체를 가져 온다
            if(ani instanceof Human) {  // Human형으로 다운 캐스팅 가능 한지 확인
                Human h = (Human) ani;
                h.readBook();   // 원래 자신의 클래스에 대한 참조 변수이기 때문에 접근 가능 함
            } else if(ani instanceof Tiger) {
                Tiger t = (Tiger) ani;
                t.hunting();
            } else if(ani instanceof Eagle) {
                Eagle e = (Eagle) ani;
                e.flying();
            } else {
                System.out.println("지원 되지 않는 형입니다.");
            }
        }

    }
}
