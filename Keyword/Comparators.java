import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Comparators {
    public static void main(String[] args) {
        // Example usage of comparators can be added here
        // Comparators are typically used with collections to define custom sorting logic
        // For instance, you can create a comparator for sorting objects based on specific fields

        Comparator<Student> com = new Comparator<Student>() 
        {
            public int compare(Student s1 , Student s2){
                if(s1.age > s2.age)
                    return 1;
                else               
                    return -1;                
            }

        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Venu", 21));
        studs.add(new Student("Sinchu", 22));        
        studs.add(new Student("Manthu", 20));
        studs.add(new Student("Yogith", 24));
        studs.add(new Student("Kiran", 25));

        Collections.sort(studs,com);
        for (Student s : studs){
            System.out.println(s);
        }
    }
}

*/


/* 

class Student implements Comparable<Student> {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }



    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        if (this.age > that.age)
            return 1;
        else 
            return -1;

        
    }
}

public class Comparators {
    public static void main(String[] args) {
        // Example usage of comparators can be added here
        // Comparators are typically used with collections to define custom sorting logic
        // For instance, you can create a comparator for sorting objects based on specific fields

        Comparator<Student> com = new Comparator<Student>() 
        {
            public int compare(Student s1 , Student s2){
                if(s1.age > s2.age)
                    return 1;
                else               
                    return -1;                
            }

        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Venu", 21));
        studs.add(new Student("Sinchu", 22));        
        studs.add(new Student("Manthu", 20));
        studs.add(new Student("Yogith", 24));
        studs.add(new Student("Kiran", 25));

        Collections.sort(studs);
        for (Student s : studs){
            System.out.println(s);
        }
    }
}


*/



// lambda expression version of the comparator and ternary operator version

class Student{

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
  

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Comparators {
    public static void main(String[] args) {
        // Example usage of comparators can be added here
        // Comparators are typically used with collections to define custom sorting logic
        // For instance, you can create a comparator for sorting objects based on specific fields

        Comparator<Student> com = (Student s1 , Student s2) -> { return s1.age > s2.age ? 1: -1;               

        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Venu", 21));
        studs.add(new Student("Sinchu", 22));        
        studs.add(new Student("Manthu", 20));
        studs.add(new Student("Yogith", 24));
        studs.add(new Student("Kiran", 25));

        Collections.sort(studs,com);
        for (Student s : studs){
            System.out.println(s);
        }
    }
}