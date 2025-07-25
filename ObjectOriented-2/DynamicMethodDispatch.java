
class A{
    public void show(){
        System.out.println(" In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

class D{
    public void show(){
        System.out.println("In D show");
    }
}


public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        A obj = new A();  // reference variable of class A and object also created OF class A
        obj.show();

        obj = new B();  // here Object of B is created . its reference variable will be the class A variable. to take A's object it should be inherited from that class.
        obj.show();

        obj = new C();  // here object of c is created and its reference variable will be the class A variable.to take A's object it should be inherited from that class.
        obj.show();


        //  obj = new D();   show error  becouse class D doesnt inherited by class A.
        //  obj.show();
    }
}
