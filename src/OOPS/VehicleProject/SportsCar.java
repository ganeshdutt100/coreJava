package OOPS.VehicleProject;
//(Multilevel Inheritance )
public class SportsCar extends Car {

    String turboType;
    public SportsCar(String brand , int speed , int doors,String turboType){
        super(brand , speed , doors);
        this.turboType = turboType;
    }


    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("TurboType : " + turboType);
    }
    public void activateTurbo(){
        System.out.println("Turbo : "+ turboType + "Activated ");
    }

}
