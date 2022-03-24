package SAQE;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
public class Employee implements Serializable
{
    private Integer empNo;
    private String empName;
    private  double empSalary;
    public Employee(Integer empNo,String empName,double empSalary)
    {
        this.empNo=empNo;
        this.empSalary=empSalary;
        this.empName=empName;
    }
    public  String toString()
{
    return empNo+""+empSalary+""+empName;
}
}
class  TestLo{
    public static void main(String[] args) throws FileNotFoundException , IOException {
        Employee employee=new Employee(1098,"SAQUIB IN CHWTI",17000);
        FileOutputStream fos=new FileOutputStream("Demo.txt");
        fos.flush();
        fos.close();
        System.out.println("save it");
    }
}
