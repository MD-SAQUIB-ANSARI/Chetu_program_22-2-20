package SAQE;

public class OdEv {
    public static void main(String[] args) {
        int arr[]=new int[]{23,24,25,26,28,29};
        for (int i=0;i<arr.length;i++)
        {
           if (arr[i]%2==0)
           {
               System.out.println("even no is "+ arr[i]);
           }
        }
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]%2!=0)
            {
                System.out.println(arr[i] + "this is no ood");
            }
        }
    }
}
