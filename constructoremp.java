class employee {
    int empnum;
    String empname;
    employee(int n,String s)
    {
        empnum=n;
        empname=s;
    
    }
    void display()
    {
        System.out.println("employee details");
        System.out.println("---------------");
        System.out.println("employee name:"+empname);
        System.out.println("employee number:"+empnum);


    }
}
public class constructoremp {

    public static void main(String args[])
    {
        employee ob=new employee(20,"jomu");
        ob.display();
    }
}