package SAQE;

public class M6 {

    public static void main(String[] args) {
        //Assign text "300" to String variable a
        String a="300";
        //Pass a i.e.String “300” as a parameter to parseInt()
        //to convert String 'a' value to integer
        //and assign it to int variable x
        int x=Integer.parseInt(a);
        System.out.println("Variable x value --->"+x);
        //Assign text "200" to String variable b
        String b="200";
        //Pass b i.e.String “200” as a parameter to parseInt()
        //to convert String 'b' value to integer
        //and assign it to int variable y
        int y=Integer.parseInt(b);
        System.out.println("Variable y value --->"+y);
        //Add integer values x and y i.e.z = 300+200
        int z=x + y;
        //convert z to String just by using '+' operator and appending ""
        String c=z + "";
        //Print String value of c
        System.out.println("Variable c value --->"+c);
        System.out.println(z);
    }
}
