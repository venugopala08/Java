class Student {
    String name;
    int age;
    int marks;

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}


public class ArrayObject {
    public static void main(String[] args) {        
        Student s1 = new Student();
        s1.name = "Venu.G";
        s1.age = 21;
        s1.marks = 90;
        s1.display();

        Student s2 = new Student();
        s2.name = "Aditi";
        s2.age = 20;
        s2.marks = 95;
        s2.display();

        Student s3 = new Student();
        s3.name = "Manish";
        s3.age = 21;
        s3.marks = 75;
        s3.display();

        Student students[] = new Student[3];    // Creating an array of Student objects
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Displaying the details of each student using a loop
        for (int i = 0; i<students.length; i++){
            System.out.println(("Stsuent Name :" + students[i].name));
            System.out.println(("Student Age " + students[i].age));
            System.out.println("Stduents marks" + students[i].marks);
        }

        // Using enhanced for loop to display student details
        System.out.println("\nUsing enhanced for loop:");
        for (Student stud : students){
            System.out.println(("Students Name :"+ stud.name));
            System.out.println(("Student Age :" + stud.age));   
            System.out.println("Students Marks :" + stud.marks);
        }
    }
}
