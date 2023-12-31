import java.util.Scanner;

public class J01018 {
    public static boolean tong(String s){
        int sum=0;
        for(char x: s.toCharArray()){
            sum+=x-'0';
        }
        return (sum%10==0);
    }
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;i++){
            if(Math.abs((s.charAt(i)-'0')-(s.charAt(i+1)-'0')) !=2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s=sc.nextLine();
            if(check(s) && tong(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
