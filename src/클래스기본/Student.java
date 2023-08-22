package 클래스기본;

public class Student {
    // private 외부에서 해당 필드에 대한 접근 막음, 같은 클래스 내에만 접근 가능
    private int ID;       // 학번 (얘네를 필드라고 부른다, 변수와 동일한데 클래스 내에 선언시 인스턴스 필드라 부름. )
    private String name;  // 이름 // private 붙이면 클래스 기재시 해당 필드는 확인이 안됨
    private int grade;    // 학년
    private String addr;  // 주소
    // 메소드
    public void showInfo() {
        System.out.println(name + ", " + addr);
    }
    // Setter method를 만듬 > 이걸 통해서 private 숨긴 필드를 다시 나타나게 해준다
    // 마우스 오른쪽 클릭 generate-setter 선택도 가능
    public String setName(String name) {
        this.name = name;
        return "참";
    }
    public void setAddr(String addr) {
        this.addr = addr;

    }
}

