

class Employee{
    int id;
    String name;
    double salary;

    public void printDetails(){
        System.out.println(" The id of the employee: " + id);
          System.out.println(" The name of the employee: " + name);
            System.out.println(" The monthly salary of the employee: " + salary);
    }

public double getSalary(){
    return salary;
}
    

public String getName(){
    return name;
}


public void   setName(String n){
    name = n;
}
}

public class EmployeeClass {
    public static void main(String[] args) {
        Employee manish = new Employee();

        manish.id=1;


manish.setName("Manish singh");
manish.salary = 23000;
System.out.println(manish.getName());

manish.printDetails();

    }}
