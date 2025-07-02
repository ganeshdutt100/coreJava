package OOPS;
class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand  = brand;
    }

    void start(){
        System.out.println("Starting the " + brand + " Vehicle ");
    } void stop(){
        System.out.println("Stoped the " + brand + " Vehicle ");
    }
}


class Car  extends Vehicle{
    int numDoors;
    Car(String brand , int numDoors){
        super(brand);
        this.numDoors = numDoors;
    }

    void honk(){
        System.out.println("Honking the horn of the " + brand + " Car.");
    }
}

class MotorCycle extends  Vehicle{
    MotorCycle(String brand){
        super(brand);
    }

    void wheelie(){
        System.out.println("Performing a wheelie on the " + brand + " MotorCycle.");
    }
}
public class code3 {
    public static void main(String[] args) {
    Car myCar = new Car("Toyota" , 4);
    MotorCycle myBike = new MotorCycle("Harley-Davidson");

    myCar.start();
    myCar.honk();
    myCar.stop();


        myBike.start();
        myBike.wheelie();
        myBike.stop();
    }
}

//super class <-----subclass1 <---subclass 2