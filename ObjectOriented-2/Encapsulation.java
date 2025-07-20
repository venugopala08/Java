
class Human{
    // private int age = 20;    // its private only it is accessible from this class. cant be access by other class.cant access by directly . it can be access by indirect way.
    // private String name = "Venu";     //  It is inistializing  the value. If you want to get data from user we have to use "getter and setter".

    private int age;
    private String name;

    // This get (getter) is used access the private values . 
    public int getAge(){    // The only way to access the private data is with the methods. which should be public.
        return age;
    }

    public String getName(){
        return name;
    }

    // The set (Setter) is used to give the values to the private variables. it is also done by methods.
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();
        // obj.age = 20;       --> Here we cant directly access the data bcs it is private variable
        // obj.name = "venu";

        // setter is used to initialize the values to the private variables.
        obj.setAge(21);
        obj.setName("Vedhanth");

        // Its calling getter method to get the values of private variales.
        System.out.println("Name :" + obj.getName() + " Age :" + obj.getAge() );

    }
}
