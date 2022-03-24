package SAQE;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
public class FBesciInput {
    public static void main(String[] args) throws IOException {
        byte[]arry=new byte[100];
        try {
           InputStream ipt=new FileInputStream("this.txt");
           ipt.read(arry);
            System.out.println("data read from ipt");
            String DAT=new String(arry);
            System.out.println(DAT);
            ipt.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        }
    }

