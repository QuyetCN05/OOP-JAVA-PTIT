import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int p=1;p<=t;p++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] arr= new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int[][] b= new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    b[i][j]=arr[j][i];
                }
            }
            System.out.println("Test "+p+":");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    int sum=0;
                    for(int k=0;k<m;k++){
                        sum+=arr[i][k]*b[k][j];
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            }

        }

    }
}
