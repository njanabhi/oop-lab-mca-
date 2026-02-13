import java.util.Scanner;
public class Employee {
    int empid, ta,da,hra,tax,basic,netsal;
    String empname;
    void getData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter employww name,id,ta,da,hra,basic and tax");
        empname=scan.nextLine();
        empid=scan.nextInt();
        ta=scan.nextInt();
         da=scan.nextInt();
        hra=scan.nextInt();
        basic=scan.nextInt();
        tax=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+ta+da+hra)-tax;
        System.out.println("net salary is:"+netsal);

    }
    public static void main(String[] args) {
        
        Employee e =new Employee();
        e.getData();
        System.out.println("employee details");
        System.out.println("name:"+e.empname);
        System.out.println("id:"+e.empid);
        e.calc();
    }
}
