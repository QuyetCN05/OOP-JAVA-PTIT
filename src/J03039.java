import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String a=sc.next();
            String b=sc.next();
            BigInteger num1= new BigInteger(a);
            BigInteger num2= new BigInteger(b);
            BigInteger num3= new BigInteger("0");
            if(num1.remainder(num2).equals(num3) || num2.remainder(num1).equals(num3)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
