package 아이패드만들기;

public class IpadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro(("iPad Pro"));
            if(!iPadPro.continueOrder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressPad();
            iPadPro.productPad();
        }

    }
}
