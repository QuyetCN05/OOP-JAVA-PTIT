import java.util.Scanner;

public class J02011 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_idx=0;
        for(int i=0;i<n-1;i++){
            min_idx=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            int tmp=arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=tmp;
            System.out.print("Buoc "+(i+1)+": ");
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
