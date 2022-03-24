package SAQE;
import java.io.IOException;
import java.io.PrintStream;
public class TestIoStr1 {
    public static void main(String[] args) throws IOException {
        PrintStream ps=new PrintStream(System.out);
        ps.println(100);
        ps.println("saquib ansari");
        ps.println(454.76);
        ps.println(true);
        System.out.println("file sucssefully save it");
    }
}
