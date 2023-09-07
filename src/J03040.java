import java.util.HashSet;
import java.util.Scanner;

public class J03040 {
    public static boolean check_1(String s){
        String str=s.substring(5,s.length());
        StringBuilder sb= new StringBuilder(str);
        sb.deleteCharAt(3);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)<=sb.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check_2(String s){
        String str=s.substring(5,s.length());
        StringBuilder sb= new StringBuilder(str);
        sb.deleteCharAt(3);
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i) != sb.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean check_3(String s){
        String str=s.substring(5,s.length());
        StringBuilder sb= new StringBuilder(str);
        sb.deleteCharAt(3);
        if(sb.charAt(0)==sb.charAt(1) && (sb.charAt(1)==sb.charAt(2))){
            if(sb.charAt(3)==sb.charAt(4)){
                return true;
            }
        }
        return false;


    }
    public static boolean check_4(String s){
        String str=s.substring(5,s.length());
        StringBuilder sb= new StringBuilder(str);
        sb.deleteCharAt(3);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) !='6' && sb.charAt(i) !='8'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       while(t-- >0){
           String s=sc.nextLine();
           if (check_1(s) || check_2(s) || check_3(s) || check_4(s)) {
               System.out.println("YES");

           }else{
               System.out.println("NO");
           }
       }

    }
}
