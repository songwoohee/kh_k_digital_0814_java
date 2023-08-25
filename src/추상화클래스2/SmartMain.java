package 추상화클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone mini 13");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

    }
}
