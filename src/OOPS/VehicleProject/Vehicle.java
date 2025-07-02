package OOPS.VehicleProject;

public class Vehicle {
    String brand;
    int speed;


    public Vehicle(String brand , int speed){
        this.brand = brand ;
        this.speed= speed;
    }

    public void displayInfo(){
        System.out.println("Brand : "+ brand);
        System.out.println("Speed : "+ speed);
    }
    public void start(){
        System.out.println(brand + " Vehicle is Starting...");
    }
    public void stop(){
        System.out.println(brand + " Vehicle is Stoped");
    }
}
