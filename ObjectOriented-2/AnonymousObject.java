
class A{
    public A(){
        System.out.println("Object Created");
    }

    public void show(){
        System.out.println("In A show");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {
        
        // A obj = new A();  --> its called Referencial Object . where reference variable is "obj". and object is "new A()""

        new A().show();  // creates a object in the heap memory and doesnt have reference variable and called " Anonymous Object".
        // we can call show function here . but the object is not "Reusable". if u write again it will create a new object in heap.
    }
}
