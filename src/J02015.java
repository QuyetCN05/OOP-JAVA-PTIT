import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> arr= new ArrayList<>();
        int[][] a= new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            List<Integer> vt= new ArrayList<>();
            for(int j=1;j<=n;j++){

                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    vt.add(j);
                }
            }
            arr.add(vt);
        }
        for(int i=0;i<arr.size();i++){
            System.out.print("List("+(i+1)+")"+" = ");
            for(Integer t: arr.get(i)){
                System.out.print(t+" ");
            }
            System.out.println();
        }

    }
}
