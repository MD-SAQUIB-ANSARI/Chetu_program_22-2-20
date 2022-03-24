package SAQE;
import java.util.Arrays;

public class M5 {
    public static void main(String[] args) {
        String str = "saquib";
        int count=0;
        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        String str2="javavava";
        System.out.println(str2.charAt(0));
        System.out.println(str2.length());
        str2=str2.toLowerCase();
        System.out.println(str2);
        System.out.println(str2.toLowerCase());
        System.out.println(str2.repeat(1));
        count++;
        System.out.println(count);
    }
}

//     [s, a, q, u, i, b]
//             j
//             8
//             javavava
//             javavava
//             javavava
//             1
//
//             Process finished with exit code 0
//
