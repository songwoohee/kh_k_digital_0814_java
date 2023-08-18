package 회원정보;

import java.util.Scanner;

// 이름 :  문자열
// 나이 : 정수 (1 ~ 199 를 정상 입력으로 간주, 이의외 값이 오면 재입력 요구)
// 성별 : 문자 'M' 과 'F' 입력 받고 출력은 "남성"과 "여성"으로 출력
// 직업 : 정수로 입력 (1 = 학생, 2 = 회사원, 3 = 주부, 4 = 무직 / 1 ~ 4 이외의 값 입력시 재요구)
// 결과는 한번에 출력
public class MemberInfo {
        String name; // 인스턴스 필드 (객체 소속 변수)
        int age;
        char gender;
        int jobs;

        Scanner sc = new Scanner(System.in);

        public void setName() {
            System.out.print("이름을 입력 하세요 : ");
            name = sc.nextLine();
        }
        public void setAge() {
            while(true) {
                System.out.print("나이를 입력 하세요 : ");
                age = sc.nextInt();
                if(age > 0 && age < 200) return; // 메소드(void)를 불러 주는 위치로 되돌아감.
                // 현 구문에선 break 써도 무방하나 return이 조금 더 빨리 처리
                System.out.println("나이를 잘못 입력 했습니다.");
        }

    }

     public void setGender() {
            while (true) {
                System.out.print("성별을 입력 하세요: ");
                gender = sc.next().charAt(0); // 문자열에서 맨 앞 문자 추출
                switch (gender) {
                    case 'M' :
                    case 'm':
                    case 'F':
                    case 'f':
                        return;
                    default :
                        System.out.println("성별을 잘 못 입력 했습니다.");
                }

            }
        }
            public void setJobs(){
            while(true) {
                System.out.print("직업을 입력 하세요: ");
                jobs = sc.nextInt();
                if(jobs > 0 && jobs < 5) break;
                System.out.print("직업을 잘 못 입력 했습니다.");
            }
        }
        public int getGenderType() {
            if (gender == 'M' || gender == 'm') return 1;
            else return 2;
        }

        public void getInfo() {
            String[] genderStr = {"","남성","여성"};
            String[] jobsStr = {"","학생","회사원","주부","무직"};
            System.out.println("=".repeat(5) + "회원 정보" + "=".repeat(5) );
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
            System.out.println("성별 : " + genderStr[getGenderType()]);
            System.out.println("직업 : " + jobsStr[jobs]);

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