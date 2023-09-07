import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0){

           String str=sc.nextLine().trim();
           String res="";
           String[] arr= str.split("\\s+");
           for(String i: arr){
               res+=Character.toUpperCase(i.charAt(0));
               for(int j=1;j<i.length();j++){
                   res+=Character.toLowerCase(i.charAt(j));
               }
               res+=" ";
           }
           res=res.substring(0,res.length()-1);
           System.out.println(res);

       }


    }
}
