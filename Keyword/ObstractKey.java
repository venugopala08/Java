package Keyword;

abstract class Car{  // Only the abstract class can implement abstract method.Abstract class can have normal methods also. n

    public abstract void drive();  // Here we are difining the method. Without Abstraact class we cant define abstract method
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music ...");
    }
}

abstract class WagonR extends Car{   // if ur inheriting abstract class then u must declare the class ,otherwise u will get the error.
    public void drive(){    // Here we are declaring the method. 
        // If We cant implement or define all the abstract method from the Abstract class. then sub class becomes abstract class.
        System.out.println("Driving ...");
    }
}

class updatedWagonR extends WagonR{  // Called as concrete class

    public void fly() {
        System.out.println("Flying ...");
    }
    
}

public class ObstractKey {
    public static void main(String[] args) {
 //     Car obj = new Car();  --> We cant create a object of Abstract class.
//      WagonR obj = new WagonR();  --> This is also become Abstract class becouse it cant define method flying in it. so it become Abstract class.
        updatedWagonR obj = new updatedWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
