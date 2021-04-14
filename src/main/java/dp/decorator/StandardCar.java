package main.java.dp.decorator;

public class StandardCar extends CarAccessoriesDecorator {

    private Car car;

    public StandardCar(Car car) {
        this.car = car;
    }

    public StandardCar() {
    }

    @Override
    public double getPrice() {
        if(car != null) {
            return car.getPrice() + 50000;
        }
        else return 50000;
    }

    @Override
    public String getFeatures() {
        if(car!=null) {
            return car.getFeatures() + " + Standard";
        }
        else return "Standard";
    }


}
