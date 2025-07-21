class Human{
    String name;       // while initializing the values we usually initialize inside the cunstructor . so its defaultly access the data while creating onjects.
    int age;

    public Human(){    // Its is a defualt constructor.  Whenever the Object is created its called. if 2 object created then its called 2 times.
        
        // System.out.println("I Am inside constructure");

        name = "Venu";  // we initialize the variable inside the constructor so that when we create the Object its automatially access the data.
        age = 21;
    }

    public Human(String name , int age){    // Its a parameterized constructor.
        this.name = name;
        this.age = age;
    }
}


public class Constrctor {
    public static void main(String[] args) {
        
        Human obj = new Human();   // once object created its by default call the Constructor.
        // obj.name = "Venu";
        // obj.age = 21;
        System.out.println(obj.name + ":" + obj.age);

        Human obj2 = new Human("Vedhanth",20);  
        System.out.println(obj2.name + ":" + obj2.age);
    }
}
