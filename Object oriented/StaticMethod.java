
class Mobiles {
    String brand;
    int price;
    static String name;

    public void display()
    {
        System.out.println("Brand: "+brand + " Price: "+price +" Name: "+name);
    }

    public static void display1(){
        // System.out.println("Brand: "+brand + " Price: "+price +" Name: "+name); --> we cant use variable inside the static variable.
        System.out.println("Name " + name);  // --> We only can use static variable inside static method
    }

    public static void display1(Mobiles obj){           //  We Have to give object reference inside the parameter. or recive the object.
        System.out.println("Brand: "+obj.brand + " Price: "+obj.price +" Name: "+name);  // while printig variable we have to use object reference for non-static variables.
    }
    
}


public class StaticMethod {
    public static void main(String[] args) {
        
        Mobiles obj1 = new Mobiles();
        obj1.brand = "Iphone";
        obj1.price = 100000;
        Mobiles.name = " Phone ";

        Mobiles obj2 = new Mobiles();
        obj2.brand = "Samsung";
        obj2.price = 90000;
        Mobiles.name = " Phone ";

        Mobiles obj3 = new Mobiles();
        obj3.brand = "Nothing";
        obj3.price = 40000;
        Mobiles.name = " Phone ";

        obj1.display();
        obj2.display();
        obj3.display();

        Mobiles.display1();   // --> We can use Class name to call Static method. we dont use normaly objects. we can acces it anywhere using class name.

        // we can indirectly access the normal varible in static method. to do that we have to pass the obj1 values inside static methos class.

        Mobiles.display1(obj1);

    }
}
