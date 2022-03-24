package SAQE;
import java.util.Scanner;
public class A1223 {
            public static void main(String[] args) {
                System.out.println("ente the value of araray");
                int a[]=new int[5];
                int temp;
                Scanner sc=new Scanner(System.in);
                for (int i=0;i<5;i++)
                {
                    a[i]= sc.nextInt();
                }
//                for (int j=0;j<5;j++) {
//                    a[j]= sc.nextInt();
//                }
                for (int i=0;i<5; i++)
                {for (int j=i; j<5-1;j++)
                    {
                        if(a[i]>a[j])
                        {temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                }
                for (int i=0;i<5;i++) {
                    System.out.print(  "" +          a[i]   +   "ghfg ");
                }
            }
        }


