package Interface;

class D{
    public void ShowTheDataOfThisClass(){
        System.out.println("In Class D");
    }
}


class F extends D {
    @Override   // This is annotaion help you to resolve the problem. show error if the method doesnt override.
    public void ShowTheDataOfThisClass(){
        System.out.println("In Class F");
    }
}

public class Annotation {
    public static void main(String[] args) {

        D obj = new D();
        obj.ShowTheDataOfThisClass(); // we are expecting to print In F class . But we wil get In D class.
        // Becouse while writing code we wrote wrong method name in class D so there no overide created . we can debug this using annotations.
        
    }  
}