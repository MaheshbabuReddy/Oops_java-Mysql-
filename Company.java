import java.util.*;
public class Company {
 
    String role = "Employee" ;
    public void show(){
    
        System.out.println("Role : "+role);
    }
    public class Employee extends Company {
        String name ;
        String role ;
    public Employee(String name , String role ){
        this.name = name ;
        this.role = role ;
    }
    @Override
    public void show(){
        System.out.println("Name : "+name);
        System.out.println("Role : "+role);
    }
}
    
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Company c = new Company();
    c.show();
    System.out.print("Enter name: ");
    String name = sc.next();
    System.out.print("Enter role: ");
    String role = sc.next();
    Employee e = c.new Employee(name,role);
    e.show();
    sc.close();
}
    
}
    

