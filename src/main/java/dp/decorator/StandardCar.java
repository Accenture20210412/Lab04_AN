package main.java.dp.decorator;

public class StandardCar implements Car {

    private Car car;

    public StandardCar(Car car) {
        this.car = car;
    }

    public StandardCar() {
    }

    @Override
    public double getPrice() {
        return 50000;
    }

    @Override
    public String getFeatures() {
        return "Standard car";
    }


}
