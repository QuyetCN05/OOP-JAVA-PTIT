import java.util.Scanner;


public class J02014 {
    public static int check(int[] arr,int n){
       int sum=Integer.MIN_VALUE;
       int left=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           sum+=arr[i];
       }
       for(int i=0;i<n;i++){
           sum-=arr[i];
           if(sum==left){
               return i+1;
           }
           left+=arr[i];
       }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(check(arr,n));

        }



    }
}
