package OOPS.VehicleProject;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Information ");
        Car myCar = new Car("Toyota", 140, 4);
        myCar.displayInfo();
        myCar.openTrunk();



        System.out.println("Sport Car Information ");
        SportsCar mySportCar = new SportsCar("Ferrari" , 220,2,"Active Turbo Mode ");
        mySportCar.displayInfo();
        mySportCar.activateTurbo();




        System.out.println("Bike Information ");
        Bike myBike = new Bike("Hero" , 90 , true);
        myBike.displayInfo();
        myBike.sound();
    }
}

