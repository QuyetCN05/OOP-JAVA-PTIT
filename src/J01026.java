import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long a=sc.nextInt();
            long b=(int)Math.sqrt(a);
            if(b*b==a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
