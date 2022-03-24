package SAQE;
import java.io.*;
import java.util.*;

public class TestIoStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enrther the value od dayat");
        String data=sc.nextLine();
        byte arr[]=data.getBytes();
        try
        {
            OutputStream os=new FileOutputStream("DEMO.text");
            os.write(arr);
            os.close();
            System.out.println("File SAVE IT");
        }catch (FileNotFoundException E)
        {
            System.out.println(E);
        }catch (IOException E)
        {
            System.out.println(E);
        }
    }
}