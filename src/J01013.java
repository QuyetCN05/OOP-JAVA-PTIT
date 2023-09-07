import java.util.Scanner;

public class J01013 {
    public static int max= (int)2e6+1;
    public static int[] arr= new int[max];
    public static void sieve(){
        arr[1]=1;
        for(int i=2;i<max;i++){
            arr[i]=i;
        }
        for(int i=4;i<max;i+=2){
            arr[i]=2;
        }
        for(int i=3;i*i<max;i++){
            if(arr[i]==i){
                for(int j=i*i;j<max;j+=i){
                    if(arr[j]==j){
                        arr[j]=i;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sieve();
        long sum=0;
        while (t-- >0){
            int n=sc.nextInt();
            if(n==1) sum=1;
            while(n !=1){
                sum+=arr[n];
                n=n/arr[n];
            }
        }
        System.out.println(sum);


    }
}
