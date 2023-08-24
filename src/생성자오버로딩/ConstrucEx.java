package 생성자오버로딩;

public class ConstrucEx {
    public static void main(String[] args) {
        Car car = new Car();
        car.carInfo();

        Car santafe = new Car("싼타페");
        santafe.carInfo();

        Car avante = new Car("아반떼","white");
        avante.carInfo();

        Car grandure = new Car("그랜저","black",220);
        grandure.carInfo();

        Car tucson = new Car("투싼","gray",210,170);
        tucson.carInfo();


    }
}
