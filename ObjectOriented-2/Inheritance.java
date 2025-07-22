
class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1 , int n2){
        return n1 - n2;
    }
}

class AdvCalc extends Calc{
    public int multi(int n1 , int n2){
        return n1 * n2;
    }

    public int div(int n1 , int n2){
        return n1/n2;
    }
}

class Scientific extends AdvCalc {
    public double power(int n1, int n2){
        return Math.pow(n1,n2);
    }
    
}

public class Inheritance {
    public static void main(String[] args) {
        // AdvCalc obj1 = new AdvCalc();    this is Single-level Inheritance.

        Scientific obj1 = new Scientific();
        int r1 = obj1.add(4,5);
        int r2 = obj1.sub(8,3);
        int r3 = obj1.multi(5,3);
        int r4 = obj1.div(10,2);
        double r5 = obj1.power(4,6 );

        System.out.println("Add :"+r1 + ", Sub :"+r2+", Mul :"+r3+", div :"+r4 + ", Power :"+ r5);
    }
}


// Single-level inheritance = Calc <-- AdvCalc  .  Here AdvCalc is inherited by Calc.
// Multi-level Inheritance =  Calc <-- AdvCalc <-- Scientific . This is multilevel where Scientific is inherited by AdvCalc and AdvCalc is inherited by Calc.\
// Java doesn't support multiple inheritance.
