package SAQE;

public class Duplicare {
    public static void main(String[] args) {
        int arr[]=new int[]{54,56,56,43,22,22,};
        System.out.println("enter the value of ");
        for (int i=0;i<arr.length;i++)
        {
                  {
                      for (int j=i;j<arr.length;j++)
                      {
                          if (arr[j]==arr[i])
                              System.out.print(arr[i]);
                              System.out.print(" ");
                              System.out.print(arr[j]);
                      }
            }
        }
    }
}
