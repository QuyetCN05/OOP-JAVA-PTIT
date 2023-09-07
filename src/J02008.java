import java.util.Scanner;

public class J02008 {
    public static int gcd(int a,int b){

        while(b !=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int ans=1;
            for(int i=1;i<=n;i++){
                ans=(ans*i)/gcd(ans,i);
            }
            System.out.println(ans);
        }


    }
}
