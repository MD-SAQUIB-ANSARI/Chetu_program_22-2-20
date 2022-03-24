package SAQE;
public class ArrayJagged {
    public static void main(String[] args) {
        // 2 D   int arr[][]={{1,2,3,4},{3,4,6,78,66}};
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        //arr[0]=new int[2];
        arr[1]=new int[2];
        arr[2]=new int[1];
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[0][2]=3;
//        arr[1][0]=5;
//        arr[1][1]=7;
//        arr[2][0]=9;
        int count =0;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=count++;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
