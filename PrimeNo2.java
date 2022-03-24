package SAQE;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        int a,count=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for (int i=1;i<=a;a++)
        {
            if(a%i==0)
            {
                count++;
            }
            if (count==2)
                System.out.println("no is prime");
        }
    }
}
