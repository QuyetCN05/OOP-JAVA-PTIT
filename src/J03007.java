import java.util.Scanner;

public class J03007 {
    public static boolean check(String s){
        String str=s;
        StringBuilder sb= new StringBuilder(s);
        String res=sb.reverse().toString();
        return(res.equals(str));
    }
    public static boolean tong(String s){
        int sum=0;
        for(char x: s.toCharArray()){
            sum+=x-'0';
        }
        return (sum%10==0);
    }
    public static boolean lastDigit(String s){
        return (s.charAt(s.length()-1)=='8');
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            if(check(s) && tong(s) && lastDigit(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }

    }
}
