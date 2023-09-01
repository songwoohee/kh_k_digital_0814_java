package 정적멤버와메소드;

public class Bank {
    private static int count = 0; // 정적 필드, 객체로 생성 되지 않음
    private int account; // 계좌
    private  String bank; // 은행 이름
    public Bank(String name, int account) {
        count++;
        this.bank = name;
        this.account = account;
        System.out.println(bank + " 은행에 계좌를 개설 합니다. 잔액은 " + this.account + " 입니다.");
    }
    public static int getCount() { // 정적 메소드, 객체로 만들어지지 않음.
        return count;
    }
    public void setDeposit(final int dep) {  // final을 붙인 이유 > 입금 받은 금액 변경 안됨. 입금 받은 금액 그대로 유지. 상수화됨
        this.account += dep;
        System.out.println(dep + " 을 예금 했습니다.");
    }
    public void setWithDraw(final int with) {
        if(with > account) {
            System.out.println("잔액이 부족 합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 : " + account + " 입니다.");
    }
}
