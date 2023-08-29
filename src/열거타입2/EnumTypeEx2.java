package 열거타입2;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("우희",DevType.BACKEND, Career.JUNIOR,Gender.MALE );
        developer.devInfo();
    }
}
