package SAQE;

public class Array {
    public static void main(String[] args) {
        int arr1[]=new int[] {32,45,22,23,22};
        int arr[]=new int []{arr1.length};
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=arr1[i];
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==arr1[i])
            System.out.print(arr[i]+ " "  );
        }
        System.out.println();
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " "  );
        }
    }
}
