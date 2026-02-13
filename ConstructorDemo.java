import java.util.Scanner;
 class Std {
    int rno;
    String name;
    Std(int r,String n)
    {
        rno=r;
        name=n;

    }
    void display()
    {
        System.out.println("student details");
        System.out.println("-----------------");
        System.out.println(" name:"+name);
        System.out.println(" number:"+rno);

    }
}
public class ConstructorDemo
{
    public static void main(String[] args)
    {
        Std ob=new Std(12,"anu");
        ob.display();
    }
}