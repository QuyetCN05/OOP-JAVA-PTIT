import java.util.Scanner;

public class J01006 {
    public static long fib(int n){
        long f_1=1;
        long f_2=1;
        long Fibo=0;
       if(n <=2){
           return  1;
       }else{
           for(int i=3;i<=n;i++){
               Fibo=f_1+f_2;
               f_2=f_1;
               f_1=Fibo;
           }
           return Fibo;
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- >0){
            int n=sc.nextInt();
            System.out.println(fib(n));
        }
    }
}
