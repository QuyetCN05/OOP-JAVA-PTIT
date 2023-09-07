import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class helloFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("Hello.txt"));
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(s);
        }
    }


}
