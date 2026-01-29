import java.util.Scanner;
public class Student {
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n enter student name,roll no,and marks of 3 subjects:");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
        scan.close();


    }
void cal()
{
    total=m1+m2+m3;
    average=total/3.0f;
    System.out.println("total marks:"+total);
    System.out.println("average:"+average);

}
public static void main(String[] args) 
    {
        Student r= new Student();
         r.getdata();
         System.out.println("\n\n student details");
        System.out.println("name:"+r.name);
        System.out.println("roll number"+r.rollno);
        r.cal();
}
}
