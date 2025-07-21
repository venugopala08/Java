class Student{
    String name = "Manish";
    int age = 20;
    public String getName() {
        return name;
    }
    // public void setName(String name) {   --> set the data from the userside.
    //     this.name = name;
    // }
    public int getAge() {
        return age;
    }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    
}

public class ThisKeyword{
    public static void main(String[] args) {
        
        Student std = new Student();

        // std.setName("Venu");   --> This is used to give bye the user.
        // std.setAge(21);

        System.out.println(" Student Name :"+std.getName()+" Age :"+std.getAge());
    }
}
