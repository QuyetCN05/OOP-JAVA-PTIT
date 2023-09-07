import java.util.Scanner;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr= new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            int tmp=0;
            for(int j=0;j<3;j++){
                if(arr[i][j]==1){
                    tmp++;
                }
            }
            if(tmp>(3-tmp)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
