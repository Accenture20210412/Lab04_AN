package main.java.dp.decorator;

public class StandardCar implements Car {

    @Override
    public double getPrice() {
        return 50000;
    }

    @Override
    public String getFeatures() {
        return "Standard car";
    }
}
