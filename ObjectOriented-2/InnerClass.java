
class A{

    int age;
    public void show(){
        System.out.println("In class A");
    }

    class B{
        public void config(){
            System.out.println("In class B");
        }
    }

    static class C{
        public void display(){
            System.out.println("IN STATIC CLASS ");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.show();

        A.B obj2 = obj1.new B();  // here we cant directly create the object of the class. becouse class B is inside the class A
        obj2.config();            // with the object of A we can create the object of B.

        A.C obj3 = new A.C();    // we Can create object without object of A . becouse it is a static class.
        System.out.println("Static class C");
        
    }
}
