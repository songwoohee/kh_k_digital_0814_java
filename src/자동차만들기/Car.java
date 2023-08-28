package 자동차만들기;

public abstract class Car {

    int speed;
    int fuel;
    int tank;
    int seats;
    String name;

    }


// 스포츠카
abstract class SportsCar implements Cartype {
    @Override
    public void car() {
        int speed = 250;
        int fuel= 8;
        int tank = 30;
        int seats = 2;
        String name = "스포츠카";
    }
}
// 승용차
abstract class Sedan implements Cartype {
    @Override
    public void car() {
        int speed = 200;
        int fuel= 12;
        int tank = 45;
        int seats = 4;
        String name = "승용차";
    }
}