package 자동차만들기종합;

public class SportsCar extends Car{
    public SportsCar(String name) {
        this.name = name;
        maxspeed = 250;
        fuelEff = 8;
        fuelTank = 30;
        seatCnt = 2;
    }
    @Override
    void setMode(boolean isMode) {
        if(isMode) maxspeed *= 1.2;

    }
}
