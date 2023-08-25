package 디폴트메소드;

public interface RemoteControl {
    int MAX_VOLUME = 100;  // final static이 자동으로 추가(모두 대문자) , 객체로 안만들어진다. 상속이 안됨
    int MIN_VOLUME = 0;    // final static이 자동으로 추가(모두 대문자)
    void turnON();  // 자동으로 public abstract 추가 됨
    void turnOFF();
    void setVolume(int vol);
    // 디폴트 메소드는 JDK 8 이후에 추가 됨
    default void setMute(boolean mute) {
        if(mute) System.out.println("무음 처리 합니다.");
        else System.out.println("무음 해제 합니다.");
    }
    static void changeBattery() {
        System.out.println("건전지를 교환 합니다.");
    }
}
