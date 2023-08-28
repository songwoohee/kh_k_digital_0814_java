package 객체를배열로관리;

import java.util.Scanner;

public class ObjectArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 인원 : ");
        int cnt = sc.nextInt();
        NameCard[] nameCards = new NameCard[cnt];  // NameCard[] 라는 자료형, new NameCard > new라는 생성자를 만들어서 cnt 횟수만큼 입력
        // NameCard라는 형이다. (int,String 처럼..) 이 안에 이름, 나이, 폰번호 등 다 있다라는 뜻. new NameCard[cnt]; cnt 횟수만큼 출력 하겠다.
        System.out.println("-".repeat(5)+"정보 입력"+"-".repeat(5));
        for (int i = 0; i < nameCards.length; i++) {
            nameCards[i] = new NameCard();
            System.out.print("이름 : ");
            nameCards[i].setName(sc.next());
            System.out.print("나이 : ");
            nameCards[i].setAge(sc.nextInt());
            System.out.print("이메일 : ");
            nameCards[i].setMail(sc.next());
            System.out.print("연락처 : ");
            nameCards[i].setPhone(sc.next());
        }
        for(NameCard card : nameCards) {   // 향상for문 > 자료형 : 배열
            card.printInfo();
        }

    }
}
