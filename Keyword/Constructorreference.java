import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Studentss {
    private String name;
    private int age;

    
    public Studentss() {
    }
    
    public Studentss(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
    
}

public class Constructorreference {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Venu", "Sinchu", "Manthu", "Yogith");
        
        List<Studentss> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Student(name));
        // }

        students = names.stream()
            .map(name -> new Studentss(name)) // Using lambda expression to create new Student objects
            .toList();

        System.out.println(students);
        }
}
