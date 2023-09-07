import java.util.Scanner;

public class J03006 {
    public static boolean check(String s){
        String str=s;
        StringBuilder sb= new StringBuilder(s);
        String res=sb.reverse().toString();
        return (res.equals(str));

    }

    public static boolean chan(String s){
        for (char x: s.toCharArray()){
            if(x !='2' && x !='0' && x !='4' && x !='6' && x !='8'){
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
            if(check(s) && chan(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



        }
    }
}
