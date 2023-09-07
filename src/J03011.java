import java.math.BigInteger;
import java.util.Scanner;

public class J03011 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while (t-- >0){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            BigInteger result;
            BigInteger num1= new BigInteger(s1);
            BigInteger num2=new BigInteger(s2);
            result=num1.gcd(num2);
            System.out.println(result);


        }

    }
}
