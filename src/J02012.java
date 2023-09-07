import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Buoc "+0+": "+arr[0]);
        int key;
        for(int i=1;i<n;i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;

            }
            arr[j+1]=key;
            System.out.print("Buoc "+i+": ");
            for(int t=0;t<=i;t++){
                System.out.print(arr[t]+" ");
            }
            System.out.println();
        }
    }
}
