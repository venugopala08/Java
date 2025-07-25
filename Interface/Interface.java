package Interface;



// Using interface 

interface Computer{
    public void code();
    
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code --> Compile --> Run --> Output ");
    }
}

class Developer{
    public void develop(Computer comp){
        comp.code();
    }
}

class DescTop implements Computer{
    public void code(){
        System.out.println("Code --> Compile --> Run --> Output : Faster");
    }
}

public class Interface {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Computer lap = new Laptop();
        Computer desk = new DescTop();

        dev.develop(desk);

    }
}


/* 

// Using astract class and method 

abstract class Computer{
    public abstract void code();
}


class Developer{
    public void code(Computer comp){
        comp.code();
    }
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Code --> Compile --> Run --> Output ");
    }
}

class DescTop extends Computer{
    public void code(){
        System.out.println("Code --> Compile --> Run --> Output : Faster");
    }
}


public class Interface{
    public static void main(String[] args) {
        Developer venu = new Developer();
        Laptop lap = new Laptop();
        DescTop desc = new DescTop();

        venu.code(desc);  
        venu.code(lap);

    }
}



*/