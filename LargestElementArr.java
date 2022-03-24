package SAQE;

import java.util.Scanner;

public class LargestElementArr {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        int count1=0;
            for (int i=0;i<n;i++) {
                if (arr[i]%2==0)
                {
                    count++;
                    System.out.println(arr[i]+ "  is evecen  "  +count);
                }
                else
                {
                    count1++;
                    System.out.println(count1+ "  no is odd  " + arr[i]);
                }
            }
        }
    }

