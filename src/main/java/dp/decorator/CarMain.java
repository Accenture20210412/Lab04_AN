package main.java.dp.decorator;

public class CarMain {
    public static void main(String[] args) {

        Car airc = new CarWithAirConditioning();
        System.out.println(airc.getPrice());
        System.out.println(airc.getFeatures());

        Car stan = new StandardCar(airc);
        System.out.println(stan.getPrice());
        System.out.println(stan.getFeatures() + "\n");


        Car standardCar = new StandardCar();
        System.out.println("Standard car price: " + standardCar.getPrice());
        System.out.println("Standard car features: " + standardCar.getFeatures());

        Car carWithAC = new CarWithAirConditioning(standardCar);
        System.out.println("Car with AC price: " + carWithAC.getPrice());
        System.out.println("Car with AC features: " + carWithAC.getFeatures());

        Car premium = new PremiumCar(carWithAC);
        System.out.println("Car Premium and with AC price: " + premium.getPrice());
        System.out.println("Car Premium and with AC features: " + premium.getFeatures() + "\n");



        //sprawdzanie kolejności dodawania wyposażenia podpunkt b)
        Car withAC2 = new StandardCar();
        System.out.println("Car 2 with AC price: " + withAC2.getPrice());
        System.out.println("Car 2 with AC features: " + withAC2.getFeatures());

        Car premium2 = new PremiumCar(withAC2);
        System.out.println("Car Premium 2 price: " + premium2.getPrice());
        System.out.println("Car Premium 2 features: " + premium2.getFeatures());

        Car standard2 = new CarWithAirConditioning(premium2);
        System.out.println("Car 2 premium and with AC price: " + standard2.getPrice());
        System.out.println("Car 2 premium and with AC features: " + standard2.getFeatures());


    }

}
