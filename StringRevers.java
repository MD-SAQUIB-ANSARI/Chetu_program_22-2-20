package SAQE;
public class StringRevers {
    public static String stringrevers(String str) {
        char arr[] = str.toCharArray();
        String revers = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            revers = revers + arr[i];
        }
        return revers;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = stringrevers("saquibabsari");
        String str1 = stringrevers("fedcba");
        String str2 = stringrevers("HGFEDCBA");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
