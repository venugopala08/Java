package Interface;

// MIAN DIFFERENCE B/W ABSTRACT AND INTERFACE IS ABSTRACT IS CLASS, AND INTERFACE IS NOT A CLASS.
//  class - class -> extends
//  class - interface -> implememts
//  interface - interface -> extends

interface A{
    int age = 21;                 // By default its final and static .
    String area = "Mangaluru";

    void show();  // Here methods are defualtly public abstract methods . we dont need to mention while declaring the object.
    void config();
}

interface X{       // Multiple inheritacne can be implemented by single class. But cant be done in abstract class.
    void run();
}

class B implements A,X{
    public void show(){
        System.out.println("In show");
    }

    public void config(){
        System.out.println("In config");
    }

    public void run(){
        System.out.println("Running ... ");
    }
}

interface Y extends X{    // here Y interfece inherite X.

}

class C implements Y{    // we have to declare method run() which is a method of X .here Y inherit X so we to declare the method of X When we use Y.
    public void run(){
        System.out.println("Running ... using Y interface");
    }
}


public class Interface2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
        obj.config();
//      obj.run();   --> we cant call with obj. becous its type of A. but run() is method of X . so we have to create object type of X

        X obj1 =  new B();
        obj1.run();

//      A.area = " DK ";  --> We cant change value of variable. becouse its ny default final becouse it is declare in interface. there variable will be final and static.
        System.out.println(A.age+" : " + A.area);
    }
}
