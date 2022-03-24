package SAQE;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileInPutStr  {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream input = new FileInputStream("deom.txt");
            int b=input.read();
            while (b!=-1)
            {
                System.out.println((char)b);
            }
            input.close();
            System.out.println("this is a compile");
        }catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
