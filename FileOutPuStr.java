package SAQE;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class FileOutPuStr {
    public static void main(String[] args) throws IOException
    { byte b[]= {'A','B','C'};
        try {
            FileOutputStream out=new FileOutputStream("FGDG.text");
             out.write(b);
        }  catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
