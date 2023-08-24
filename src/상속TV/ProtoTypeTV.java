package 상속TV;
// 시제품
public class ProtoTypeTV {
    boolean isPower; // 전원값 저장
    int channel; // 채널 정보 저장
    int volume; // 볼륨 값 저장
    public ProtoTypeTV() {
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    // 생성자 오버로딩
    public ProtoTypeTV(boolean isPower, int channel, int volume) {
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }

    public void setChannel(int ch) {
        if(ch > 0 && ch < 1000) {
            channel = ch;
        } else System.out.println("채널 설정 범위가 아닙니다.");
    }
}
