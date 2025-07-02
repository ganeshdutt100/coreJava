package OOPS.VehicleProject;
//(Hierarchical Inheritance )
public class Bike extends Vehicle {
    boolean boost;
    public Bike(String brand  , int speed  , boolean boost){
       super(brand , speed);
       this.boost = boost;
    }
    @Override
    public  void displayInfo(){
        super.displayInfo();
        System.out.println("Booster Mode  :  " + (boost ?"Yes":"No"));
    }

    public void sound(){
        System.out.println("Bike sound sound.........");
    }
}
