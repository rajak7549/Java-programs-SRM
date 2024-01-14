import java.util.Scanner;

class person {
    protected String name;
    protected String address;

    public person() {
        name = "";
        address = "";
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person name ");
        name = sc.next();
        System.out.println("Enter the address of the person");
        address = sc.next();
    }

    public void display() {
        System.out.println("Name :-  " + name);
        System.out.println("Address :- " + address);
    }
}

class student extends person {
    private int roll;
    private String course;

    public student() {
        roll = 0;
        course = "";

    }

    public void accep() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number");
        roll = sc.nextInt();
        System.out.println("Enter course");
        course = sc.next();
    }

    public void display() {
        super.display();
        System.out.println("Roll numbe is " + roll);
        System.out.println("Course is " + course);
    }
}

class Employee extends person {

    private int empid;
    private String department;

    public Employee() {
        super();
        empid = 0;
        department = "";
    }

    public void accept() {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id ");
        empid = sc.nextInt();

        System.out.println("Enter department ");
        department = sc.next();
    }

    public void display() {
        super.display();
        System.out.println("Employee id is " + empid);
        System.out.println("Deaprtmnet is " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        student s = new student();
        System.out.println("enter student details");
        s.accep();
        System.out.println("Student details");
        s.display();

        Employee emp = new Employee();
        System.out.println("Enter employe details");
        emp.accept();
        System.out.println("Dispaly employee details ");
        emp.display();

    }
}
