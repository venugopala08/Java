


class A{
    void show() throws ClassNotFoundException
    {
        Class.forName("Clac");
    }
}

public class Throws {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
