import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J02020 {
    public static int n,k;
    public static List<List<Integer>> vt= new ArrayList<>();
    public static int[] arr= new int[100];
    public static void out(){
        List<Integer> v= new ArrayList<>();
        for(int i=1;i<=k;i++){
            v.add(arr[i]);
        }
        vt.add(v);
    }
    public static void Try(int i){
        for(int j=arr[i-1]+1;j<=n-k+i;j++){
            arr[i]=j;
            if(i==k){
                out();
            }else{
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        Arrays.fill(arr,0);
        Try(1);
        for(List<Integer> x: vt){
            for(int j: x){
                System.out.print(j);
            }
            System.out.print(" ");
        }
        System.out.println("\n"+"Tong cong co "+vt.size()+" to hop");

    }
}
