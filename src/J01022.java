import java.util.Scanner;

public class J01022 {
    public static long[] arr= new long[93];
    public static void fiBo(){
        arr[1]=arr[2]=1l;
        for(int i=3;i<93;i++){
            arr[i]=arr[i-2]+arr[i-1];
        }
    }
    public static char check(int n,long k){
        if(n==1){
            return '0';
        }
        if(n==2){
            return '1';
        }
        if(k<=arr[n-2]){
            return  check(n-2,k);
        }
        return check(n-1,k-arr[n-2]);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        fiBo();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            System.out.println(check(n,k));
        }
    }


}
