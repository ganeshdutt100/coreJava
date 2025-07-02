package OOPS;
class animal{
    void sound(){
        System.out.println("Animal sound");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("dog barks");
    }
}
class puppy extends dog{
    void weep(){
        System.out.println("Puppy weeps");
    }
}
public class code4 {
    public static void main(String[] args) {
        puppy obj1= new puppy();
        obj1.weep();
        obj1.bark();
        obj1.sound();
    }
}
