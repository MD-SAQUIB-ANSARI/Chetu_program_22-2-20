package SAQE;
public class ArrayForeach {
   public static void main(String[]asdf) {
//        int arr[][]={{123,2,4},{32,45,67,23},{32,35,67,32}};
//        for (int element[]:arr)
//        {
//            for (int data:element)
//            {
//            System.out.println(data);
//        }
//        }
//       System.out.println("  the value of arry elements");
//   }
//2D ARRAY
       int arr[][][] = {{{123, 3, 13}, {2, 43, 45, 66, 43,}, {23, 5, 5, 33}}};
//   for(int x[][]:arr)
//   {
//       for (int z[]:x)
//       {
//           for (int y:z)
//           {
//               System.out.print("  "+y);
//           }
//           System.out.println();
       //   } }}

      for (int i=0;i< arr.length;++i)
      {
          for (int j=0;j< arr[i].length;++j)
          {
              for (int k=0;k< arr[j].length;++k)
              {
                  System.out.println(arr[i][j][k]);
              }
          }
      }
   }}

