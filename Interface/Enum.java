package Interface;


/* 

enum Status{       // Status is class . but we cant extend Enum class.
    Running, Failed , Pending, Success;  // THis is named constants and also a object of status class
}



public class Enum {
    public static void main(String[] args) {

        Status s = Status.Running;   // Status is type here. 
        System.out.println(s);

        System.out.println(s.ordinal());  // it will print the index of s value.

        // to print all the values
        Status []ss = Status.values();

        for (Status r : ss){
            System.out.println(r+" : "+r.ordinal());
        }
    }
}


*/


enum Laptop{   // Its supports all methods . but it doesn't support class extention (inheritance)
    MacBook(120000), Dell(80000), Asus, HP(75000); // if u initialize the Price to the named-constant or object we have to declare in constructor.

    private int price;

    

    private Laptop() {    // here we are creating default constructor bcs above we dint metion the price of Asus. if we didnt initialize the default constructor it will give error. becous in below we created constructor with parameter.
        this.price = 69999;
    }


    private Laptop(int price) {
        this.price = price;
    }


//  we can create getter and setters to access the private price.

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}



public class Enum {
    public static void main(String[] args) {

        Laptop lap = Laptop.MacBook;
        System.out.println(lap);  // we cant print the price directly here bcs its private .

        // Atfter creating getter and setters.

        System.out.println(lap + " : " + lap.getPrice());

        // To print all the data

        lap.HP.setPrice(50000); // WE can modify the values using setters.
        for (Laptop top : Laptop.values()){
            System.out.println(top+" : "+top.getPrice());
        }
    
    }
}
