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
        if(car != null) {
            return car.getPrice() + 1000;
        }
        else return 1000;
    }

    @Override
    public String getFeatures() {
        if(car!=null) {
            return car.getFeatures() + " + Air Conditioning";
        }
        else return "Air Conditioning";
    }
}
