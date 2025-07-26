package Interface;

// Lambda expression  only works on functional Interface. 

interface H{
    // void show();
    void show(int i);

}

public class Lambda {
    public static void main(String[] args) {

    //  Annonymous inner class 

        // H obj = new H() {
        //     public void show(){
        //         System.out.println("In show");
        //     }
        // };
        // obj.show();

    //  Lampbda Expression
        // H obj = () -> System.out.println("in show");  --> withoud parameter
        // obj.show();

    // Lambda expression with parameter
//      H obj = (int i) ->System.out.println("In show "+i); // -> Other way to express single parameter
        H obj = i -> System.out.println("In show "+i);
        obj.show(8);

    }
}
