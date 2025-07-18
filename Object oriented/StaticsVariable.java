
class Mobile{
    String brand;
    int price;
    static String name ;

    public void display(){
        System.out.println("Brand :" + brand +" , Price :" + price + " , Name :" + name);
    }
}


public class StaticsVariable {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "Phone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samasung";
        obj2.price = 90000;
        Mobile.name = "Phone";

        Mobile.name = "Smart Phone";    // Static variable can be accessed using class name .  it is shared across all instances of the class.
        // Static variable is shared among all instances of the class. If changes in one instance, it reflects in all instances.
        // Static variable is not tied to a specific instance of the class, but rather belongs to the class itself.
        // Static variable can be accessed without creating an instance of the class. 
        // Static variable is initialized only once when the class is loaded, and it retains its value across all instances.
        // Static variable can be used to store common data that is shared among all instances of the class.

        // for eg: if u change the value of obj1.name = "Smart Phone", then obj2.name will also be "Smart Phone".
        // This is because the static variable 'name' is shared across all instances of the class Mobile.
        // usually we dont use object name to access static variable, we use class name to access static variable. thats why we use Mobile.name = "Smart Phone";

        obj1.display();
        obj2.display();

    }
}
