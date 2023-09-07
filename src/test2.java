import java.io.File;
import java.io.PrintWriter;

public class test2 {
    public static void main(String[] args) {
        try{
            PrintWriter out= new PrintWriter(new File("output.txt"));
            out.println(100);
            out.println("Nguyen Van An \n");
            out.close();
        }catch (Exception ex){
            System.out.println("File not found");
        }
    }
}
