import java.math.BigInteger;
import java.util.Scanner;

public class J03015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine();
        String b= sc.nextLine();
        BigInteger num1 = new BigInteger(a);
        BigInteger num2= new BigInteger(b);
        System.out.println(num1.subtract(num2));
    }
}
