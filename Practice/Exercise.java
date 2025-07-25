package Practice;

// TODO: Create an class called Employee
class Employee{
    
    private String name;
    private double salary;
    
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    public void getDetails(){
        System.out.println("Name :"+name+"Salary :"+salary);
    }
    
} 

class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name,salary);
        this.department = department;
        
    }   


    public void getDetails(){
        System.out.println("Name :"+getName()+"Salary :"+getSalary()+"Department :"+department);
    }
}

// TODO: Create a class Manager that:
// - Extends Employee


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // TODO: Print their details using getDetails()

        Employee emp = new Employee("Alice",50000);
        Manager man = new Manager("Bob",80000,"IT");

        emp.getDetails();
        man.getDetails();
    }
}
