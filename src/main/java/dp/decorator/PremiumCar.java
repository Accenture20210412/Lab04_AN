package main.java.dp.decorator;

public class PremiumCar extends CarAccessoriesDecorator {

    private Car car;

    public PremiumCar(Car car) {
        this.car = car;
    }

    public PremiumCar() {
    }

    @Override
    public double getPrice() {
        return car.getPrice() + 25000;
    }

    @Override
    public String getFeatures() {
        return car.getFeatures() + " + Premium Interior";
    }
}
