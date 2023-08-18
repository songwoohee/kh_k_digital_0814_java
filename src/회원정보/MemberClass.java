package 회원정보;

public class MemberClass {
    public static void main(String[] args) {
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setName();
        memberInfo.setAge();
        memberInfo.setGender();
        memberInfo.setJobs();
        memberInfo.getInfo();

    }
}

// 출력 예시
//이름을 입력 하세요 : 우희
//        나이를 입력 하세요 : 20
//        성별을 입력 하세요: F
//        직업을 입력 하세요: 4
//        =====회원 정보=====
//        이름 : 우희
//        나이 : 20
//        성별 : 여성
//        직업 : 무직