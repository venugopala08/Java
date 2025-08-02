

import java.nio.channels.Pipe.SourceChannel;

class Laptop
{
    String model;
    int price;

    
    
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {  // double click --> source action --> click hashcode and equals --> select variables 
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    
}


public class StringHashCode {

    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Asus Vivo-Book";
        obj1.price = 40000;

        Laptop obj2 = new Laptop();
        obj2.model = "Asus Vivo-Book";
        obj2.price = 40000;

        boolean result = obj1.equals(obj2);

        System.out.println(result);
        //  System.out.println(obj1.toString()+obj2.toString());  no need to put .toString()  method name it defualt call toString function.
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
