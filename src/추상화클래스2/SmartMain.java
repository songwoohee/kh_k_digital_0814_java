package 추상화클래스2;

public class SmartMain {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("iPhone mini 13");
        smartPhone.setPower(true);
        smartPhone.internet();
        smartPhone.call();

        Phone phone = new Phone("목업") {

            @Override
            void call() {
                System.out.println("목업폰이라 통화가 안돼요 ㅠ_ㅠ");
            }
        };
        phone.call();




        }

    }
