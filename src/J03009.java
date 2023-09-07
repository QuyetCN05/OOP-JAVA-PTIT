import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s=sc.nextLine();
            String str=sc.nextLine();
            String[] arr=s.split("\\s+");
            String[] a=str.split("\\s+");
            TreeSet<String> set1= new TreeSet<>();
            TreeSet<String> set2= new TreeSet<>();
            for(String x: arr){
                set1.add(x);
            }
            for(String j: a){
                set2.add(j);
            }
            for(String i: set1){
                if(set2.contains(i)==false){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
