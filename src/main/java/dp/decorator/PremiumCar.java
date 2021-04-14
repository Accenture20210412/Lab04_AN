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
        if(car != null) {
            return car.getPrice() + 25000;
        }
        else return 25000;
    }

    @Override
    public String getFeatures() {
        if(car!=null) {
            return car.getFeatures() + " + Premium Interior";
        }
        else return "Premium Interior";
    }
}
