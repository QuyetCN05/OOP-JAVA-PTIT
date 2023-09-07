import java.util.Scanner;

public class J01024 {
    public static boolean check(long n){
        while(n !=0){
            long a=n%10;
            if(a !=0 && a != 2 && a !=1){
                return  false;
            }
            n /=10;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long a=sc.nextLong();
            if(check(a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
