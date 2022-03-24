package SAQE;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 class FileReaders {
    public static void main(String[] args) throws IOException {
        FileReader fb=new FileReader("saquibdata.text");
        BufferedReader fr=new BufferedReader(fb);
        String str;
        while ((str= fr.readLine())!=null)
        {
            System.out.println(str);
        }
        fr.close();
    }
}

