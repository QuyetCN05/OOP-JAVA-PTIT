import java.util.Scanner;
import java.util.TreeSet;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeSet<Integer> set= new TreeSet<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            set.add(x);
        }
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            set.add(x);
        }
        for(Integer j: set){
            System.out.print(j+" ");
        }
    }
}
