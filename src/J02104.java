import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class pair{
    private int x;
    private int y;

    public pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+this.getX()+","+this.getY()+")";
    }
}
public class J02104 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<pair> arr= new ArrayList<>();
        int[][] a= new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j] !=0 && i<j){
                    pair s= new pair(i,j);
                    arr.add(s);
                }
            }
        }
        for(pair t: arr){
            System.out.println(t);
        }

    }
}
