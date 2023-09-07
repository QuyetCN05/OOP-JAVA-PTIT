import java.util.Scanner;

public class J01021 {
    public static int mod=(int)1e9+7;
    public static long pow(long a,long b){
        if(b==0) return 1;
        if(b==1) return a%mod;
        long res=pow(a,b/2);

        if(b%2==0){
            return (res*res)%mod;
        }else{
            return (((res*res)%mod)*a)%mod;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       while(true){
           long a=sc.nextLong();
           long b=sc.nextLong();
           if(a==0 && b==0) break;
           System.out.println(pow(a,b));
       }


    }
}
