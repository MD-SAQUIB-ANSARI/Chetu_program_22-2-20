package SAQE;
import java.util.Scanner;
public class PrimeNo {
    public  static int show(int a)
    {
        int count=0;
        for (int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                count++;
            }
        }
        if  (count==2)
            System.out.println("no is prime no "  +a);
        else System.out.println("no is not prime  "  +a);
        return a;
    }
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       int x= show(a);
        System.out.println(x);
    }
}