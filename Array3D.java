package SAQE;
public class Array3D {
    public static void main(String[] args) {
        int arr[][][] = new int[5][4][3];
    for (int i=0;i< args.length;++i)
    {
        for (int j=0;j<arr[i].length;++j)
        {
            for (int k=0;k<arr[i][j].length;++k)
            {
                arr[i][j][k]=i*1;
            }
        }
    }
        for (int i=0;i< args.length;++i)
        {
            for (int j=0;j<arr[i].length;++j)
            {
                System.out.println("{");
                for (int k=0;k<arr[i][j].length;++k)
                {
                    System.out.println(arr[i][j][k]);
                }
                System.out.println("}");
            }
        }
    }
}
