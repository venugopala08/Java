
class A
{
    public void show1(){
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        
        A obj1 = (A) new B();   // this is called up-casting here object of b is stored in reference variable of A after upcasting into A
        obj1.show1();

       // B obj2 = obj1;  -->its show error we cant directly add the type A() reference to the Type B. Now we have to down cast the obj1.
       B obj2 = (B) new B();
       obj2.show2();
    }
}
