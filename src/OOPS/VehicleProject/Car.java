package OOPS.VehicleProject;
//(Single Inheritance )
public class Car extends Vehicle {
    int doors;

    public Car(String brand, int speed , int doors){
        super(brand , speed);
        this.doors = doors;
    }
@Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Doors "+ doors);
    }
    public void openTrunk(){
        System.out.println(brand + "car trunk is open  ");
    }
}
