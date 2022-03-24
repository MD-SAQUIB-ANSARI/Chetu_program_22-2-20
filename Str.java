package SAQE;
import java.util.Scanner;
class Str {
public static void main(String[]asdf)
        {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
        if(n%i==0)
        {
        count++;
        }
        if(count==2)
        System.out.println("theis no is prime"+n);
        else
        System.out.println("this no is not prime");
        }
        }
        }
