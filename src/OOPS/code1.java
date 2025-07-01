package OOPS;


 class car{
    String model;
    int year ;

    public void start(){
        System.out.println("Car is Starting..." + model );
    }

    public void drive(){
        System.out.println("Car is Moving...");
    }
    public void stop(){
        System.out.println("Car is stoped");
    }
}
public class code1 {
    public static void main(String[] args) {
        car myCar = new car();

        myCar.model = "Honda";
        myCar.year = 2025;

        myCar.start();
        myCar.drive();
        myCar.stop();
    }
}
