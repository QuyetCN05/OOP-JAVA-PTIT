import java.util.Scanner;

public class J01007 {
    public static boolean check(long n){
        if(n==0 || n==1){
            return  true;
        }
        long f_1=0;
        long f_2=1;
        long fibo=0;
        for(int i=1;i<=92;i++){
            fibo=f_1+f_2;
            if(n==fibo) return true;
            f_2=f_1;
            f_1=fibo;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            if(check(n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
