package 해시셋객체비교;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Member> hashSet = new HashSet<>();
        Member member1 = new Member(1001,"유나");
        Member member2 = new Member(1002,"채원");
        Member member3 = new Member(1003,"지수");
        Member member4 = new Member(1003,"카리나");
        // 4번 > 중복이 아님 , 인스턴스 주소가 달라서 hashcode가 다름
        hashSet.add(member1);
        hashSet.add(member2);
        hashSet.add(member3);
        hashSet.add(member4);
       // hashSet.add(new Member(1003,"카리나"));
        //for(Member e : hashSet) e.showMember();


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
        // s1.addAll(s2);  // 합집합 : 양쪽 모두에 있는 것, 중복 제거 된다 > [1, 2, 3, 4, 5, 6, 7, 8, 9]
        // s1.retainAll((s2));  // 교집합 : 양쪽 모두 공통적으로 존재 하는 것. > [4, 5, 6]
        s1.removeAll(s2); // 차집합 : 앞엣 뒤를 빼는것. > [1, 2, 3]
        System.out.println(s1);  //



    }
}
// 출력   id 1003 동일하나 주소가 달라서 출력 (위와 내용 동일)
// 객체는 해시코드값으로 중복제거를 해주는데 id값이 아닌 객체를 보고 다른걸 판단(주소가 다르다).

//        아이디 : 1001
//        이름 : 유나
//        아이디 : 1003
//        이름 : 카리나
//        아이디 : 1003
//        이름 : 지수
//        아이디 : 1002
//        이름 : 채원
class Member {
    int id;
    String name;
    @Override
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {   // 다운 캐스팅이 성립하는지 확인하기 위한 조건
            Member member = (Member) obj;  // 원래 형으로 형변환
            if(this.id == member.id) return true;  // id가 같으면 중복이라고 판별.
            else return false;
        }
        return false;
    }

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showMember() {
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}