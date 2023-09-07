import java.util.Scanner;

public class J03008 {
    public static boolean check(String s){
        String str=s;
        StringBuilder sb= new StringBuilder(s);
        String res=sb.reverse().toString();
        return (res.equals(s));
    }
    public static boolean nt(String s){
        for(char x: s.toCharArray()){
            if(x !='2' && x !='3' && x !='5' && x !='7'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            if (check(s) && nt(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
