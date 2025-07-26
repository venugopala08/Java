package Practice;

// TODO: Create an interface called Machine with one method: String start()
interface Machine{
    String start();
    
}

// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface

abstract class Appliance implements Machine{
    private String name;

    public Appliance(String name) {
        this.name = name;
    }
}
// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliance{

    public Fan(String name){
        super(name);
    }
    public String start(){
        return "Fan is running";
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliance{

    public WashingMachine(String name){
        super(name);
    }
    public String start(){
        return "Washing Machine is operating";
    }
}


public class Interface {
    public static void main(String[] args) {
        Machine f = new Fan("Screw");
        System.out.println(f.start());

        Machine m = new WashingMachine("bolt");
        System.out.println(m.start());
    }
}
