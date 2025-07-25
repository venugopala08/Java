//  METHOD OVERRIDING  --> Here methods will have same name parameter and return type. but have different behaviour. and present in different class.

class Calc{
    public int add(int n1,int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{           // First it will check for the method in this class if its not there then it will check for in the parent class.
    public int add(int n1, int n2){   // this class is called . so it will check in this class first. this is overrinding.
        return n1 + n2 + 1;
    } 
}

public class Overriding {

    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int res = obj.add(4,5);
        System.out.println("Addition :" + res);
    }
}