import java.util.Scanner;
public class Emp {
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter employee name");
        name=scan.nextLine();
        System.out.println("enter employee number");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("employee name:"+name);
        System.out.println("employee number:"+empno);
    }
    public static void main(String[] args) {
        Emp e= new Emp();
        e.getData();
        System.out.println("employee details");
        System.out.println("-------------");
        e.display();
    }
    }

