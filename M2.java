package SAQE;

import java.util.Scanner;

public class M2 {
//
////     with p with r
//    static int multiplicatopn(int n,int m)
//    {
//        int result=n*m;
//      return   result;
//    }
//    public static void main(String[] args) {
//        System.out.println(" with r with p");
//        System.out.println("enter the val;ue of no");
//        Scanner sc=new Scanner(System.in);
//        int firest,scend;
//        firest=sc.nextInt();
//        scend=sc.nextInt();
//        int store=multiplicatopn(firest ,scend);
//        System.out.println(store);
//    }
//   wothout p with r
    static int multiplicatopn()
    {
        Scanner sc=new Scanner(System.in);
        int firest,scend;
        firest=sc.nextInt();
        scend=sc.nextInt();
        int result=firest*scend;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("enter the val;ue of no");
       int store= multiplicatopn();
        System.out.println(store);
    }
}
