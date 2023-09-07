import java.util.Scanner;

public class J03016 {
    public static boolean check(String s) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                sum1+=s.charAt(i)-'0';
            }else{
                sum2+=s.charAt(i)-'0';
            }
        }
        return (Math.abs(sum1-sum2)%11==0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }



    }
}
