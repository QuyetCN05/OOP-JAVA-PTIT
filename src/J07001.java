import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07001 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc= new Scanner(new File("input.txt"));
        while (sc.hasNext()){
             String a=sc.nextLine();
             System.out.println(a);
        }

    }
}
