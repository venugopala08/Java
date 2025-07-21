

// every constructor hav super() init.
// class A extends object{  -->

/* 
class A{
    public A(){
        super();   // if u dont mention also it will be there in constructor.
        System.out.println("In A");
    }

    public A(int a){
        super();
        System.out.println("In A int ");
    }
}

class B extends A{ // B is inheriting A so when the object of B is created then the both B and A cunstructor are called becouse B inherits A.

    public B(){
        super(4); // super() means call the constructor of super class. so it will call first super class constructor.
        System.out.println("In B");
    }

    public B(int n){
        super(n);   // it will call the A class constructor with paramiterized.
        System.out.println("B with parameter int ");
    }
}

public class SuperThis {
    public static void main(String[] args) {
        
        B obj = new B();   // its called both A and B cunstructore. bcs B inherits A so its call both the cunstructor

        //B obj2 = new B(1);  // still its call both the constructor A and parameterized constructor of B.
    }
}


*/
// To print  " In A int in B " we just a create a object without parameter. and in class b we have to give int parameter to super key.it will call the parameterized constructor of A.




// every constructor hav super() init.
// class A extends object{  -->

class A{
    public A(){
        super();   // if u dont mention also it will be there in constructor.
        System.out.println("In A");
    }

    public A(int a){
        super();
        System.out.println("In A int ");
    }
}

class B extends A{ // B is inheriting A so when the object of B is created then the both B and A cunstructor are called becouse B inherits A.

    public B(){
        super(); // super() means call the constructor of super class. so it will call first super class constructor.
        System.out.println("In B");
    }

    public B(int n){
        this();   // it will call the A class constructor with paramiterized.
        System.out.println("In B int");
    }
}

public class SuperThis {
    public static void main(String[] args) {
        
        B obj = new B();   // its called both A and B cunstructore. bcs B inherits A so its call both the cunstructor

        //B obj2 = new B(1);  // still its call both the constructor A and parameterized constructor of B.
    }
}

// TO print " In A  , In B , In B int "  we have created object with parameterized . and next it will call the its own method becouse of this().
// In default constructor in that super() is present which call A super class and it will print In A and next the default constructor print 
// wich print In B and then at the last parameterized constructor prints .