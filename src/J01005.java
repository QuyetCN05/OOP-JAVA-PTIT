import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
           int a=sc.nextInt();
           int b=sc.nextInt();
           for(int i=1;i<a;i++){
               double s=(double) i/a;
               System.out.printf("%.6f ",b*Math.sqrt(s));
           }
            System.out.println();

        }
    }
}
