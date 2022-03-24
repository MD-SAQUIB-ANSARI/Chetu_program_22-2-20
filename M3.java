package SAQE;

import java.util.Scanner;

public class M3 {
//    public  static int checked(int n,int m,int o)
//    {
//        if (n>m)
//        {
//            System.out.println("this n is gratter"+n);
//            return reult;
//        }
//
//        if (m>n)
//        {
//            System.out.println("this m is gratter"+m);
//        }
//            int reult=0;
//             reult==n;
//        if (o>m)
//        {
//            System.out.println("this ois gratter"+o);
//        }
//        else
//            System.out.println("this is o grate then all no "+o);
//        return o;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int first=sc.nextInt();
//        int secomnd=sc.nextInt();
//        int third=sc.nextInt();
//       int xxx= checked(first,secomnd,third);
//        System.out.println(" big no is  +"+ xxx);
//    }
//       with p with r
    public static int checked(int n, int m, int o)
//    public static String checked(int n, int m, int o)
    {
        int max=0;
//        if (n > m)
//            return ("this m value is grate");
//         if  (m>n)
//            return ("the value of m is grate them n");
//        else
//            return ("the value of o is grater");
          max=(n>m)?(n>o?n:o):m>o?m:o;
            return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int first=sc.nextInt();
        int secomnd=sc.nextInt();
        int third=sc.nextInt();
//       String xxx= checked(first,secomnd,third);

//        System.out.println(" big no is  +"+ xxx);
        int store=checked(first,secomnd,third);
        System.out.println("BIGEST NO IN  "  +store);

    }
}
