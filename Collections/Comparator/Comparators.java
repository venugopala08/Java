package Comparator;

import java.util.*;

class Student{
    int age;
    String name;

    public Student(String name,int age){
        this. name = name;
        this.age = age;
    } 

    public String toString(){
        return "Student [age= "+age+", name= "+name+"]";
    }
}

public class Comparators {
    public static void main(String[] args) {
        
        Comparator<Student> c = new Comparator<Student>() {

            
            public int compare(Student t1 , Student t2){
                //return (Integer.compare(t1.age,t2.age));
                if (t1.age > t2.age) return 1;
                else return -1;
            }
        };
        
        List<Student> num = new ArrayList<>();
        num.add(new Student( "Amit",  20));
        num.add(new Student( "jamith", 26));
        num.add(new Student( "kamith", 23));
        num.add(new Student( "lamith",21));
        num.add(new Student( "sumith",  18));
        //System.out.println("Before sorting: "+num);

        Collections.sort(num,c);
        //System.out.println("After sorting: "+num);
        for( Student n: num){
            System.out.println(n);
        }
    }
}
