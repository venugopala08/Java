
class Laptop{
    String brand;
    int price;
    static String name;

    // initially class load first then initializers loads. so Static print fisrst then object. if u dont create any object then the static block also not get printed.
    // thats why use "class.forname(class_name)  it will load the class. but it eill show exception "

    static{
        name = "Laptop";    // it will call once. if multiple Object is created also it calls once.
        System.out.println("Inside the static block");
    }

    public Laptop(){
        brand = "";
        price = 60000;
        // name = "Laptop";    // every time object create it will be called but there is no need of name to call becouse its value is not changing. so it should call once.
        System.out.println("Inside the Constructor");
        
    }

    public void display()
    {
        System.out.println("Brand :" + brand + " Price :"+price+" Name :" + name);
    }
}

public class StsticBlock {
    public static void main(String[] args) {

        // Class.forName("Laptop");  which will help u load the class . sop static will print but not the cunstroctor
        
        Laptop lap1 = new Laptop();  // every time new object created it will call the constructor by default.
        lap1.brand = "MacBook";
        lap1.price = 100000;
     
        Laptop.name = "Expensive Laptop";  // we can change the value of static variable. which will reflect in all objcts values.

        Laptop lap2 = new Laptop();
        lap2.brand = "Asus";
        lap2.price = 80000;
        
        lap1.display();
        lap2.display();
    }
}
