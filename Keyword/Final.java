package Keyword;

// Final variable , method , class .

//   final class Calc --> it will stop the inheritance. u cant inherit the class. 

class Calc{
    public final void show(){       // to stop the method overiding we use the final method.
        System.out.println("By John");
    }

    public void add(int a,int b){  
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    // public void show(){                 // we cant use this method. becouse of final key word used in parent class. it stop method overriding.
    //     System.out.println("By Hazel");
    // }
}

public class Final {

    public static void main(String[] args) {

        // final variable
        final int num = 8;  // final is the keyword which will do not support the modfication of the variable.
        //  num = 9;  --> u will get the error . u cant modify the final variable.
        System.out.println(num);

        AdvCalc obj = new AdvCalc();
        obj. show();
        obj.add(3,4);  // here method overriding occurs . the addition operation by john but its stealed by Hazel.final method is used to stop the method overiding
    }
}
