package OOPS;
class Animal{
    void eat(){
        System.out.println("This Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog Barks");
    }
}
public class code2 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
    }
}
