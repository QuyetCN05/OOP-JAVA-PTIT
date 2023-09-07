import java.util.Scanner;
import java.util.TreeSet;

public class J02006 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        TreeSet<Integer> set= new TreeSet<>();
        TreeSet<Integer> set2=new TreeSet<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            set.add(x);
        }
        for(int i=0;i<m;i++){
            int x=sc.nextInt();
            if(set.contains(x)){
                set2.add(x);
            }
        }
        for(Integer x: set2){
            System.out.print(x+" ");
        }
    }
}
