package main.java.dp.decorator;

public class CarMain {
    public static void main(String[] args) {
        Car standardCar = new StandardCar();
        System.out.println("Standard car price: " + standardCar.getPrice());
        System.out.println("Standard car features: " + standardCar.getFeatures());

        Car carWithAC = new CarWithAirConditioning(standardCar);
        System.out.println("Car with AC price: " + carWithAC.getPrice());
        System.out.println("Car with AC features: " + carWithAC.getFeatures());

    }

}
}
