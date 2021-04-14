package main.java.dp.decorator;

public class CarWithAirConditioning extends CarAccessoriesDecorator {

    private Car car;

    public CarWithAirConditioning(Car car) {
        this.car = car;
    }

    public CarWithAirConditioning() {
    }

    @Override
    public double getPrice() {
        return car.getPrice() + 1000;
    }

    @Override
    public String getFeatures() {
        return car.getFeatures() + " + Air Conditioning";
    }
}
