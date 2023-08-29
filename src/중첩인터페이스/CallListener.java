package 중첩인터페이스;

public class CallListener implements Button.OnClickListener {  // 버튼 클래스 안에 있는 온클릭 인터페이스를 상속 받음
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
