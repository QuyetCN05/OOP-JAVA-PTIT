import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s=sc.nextLine().trim();
            if(s.equals("END")) break;
            String[] arr=s.split("\\s+");
            String res="";
            for(String x: arr){
                res+=Character.toUpperCase(x.charAt(0));
                for(int i=1;i<x.length();i++){
                    res+=Character.toLowerCase(x.charAt(i));
                }
                res+=" ";
            }
            res=res.substring(0,res.length()-1);
            System.out.println(res);
        }
    }
}
