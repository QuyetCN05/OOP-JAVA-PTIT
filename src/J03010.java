import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        sc.nextLine();
        while(t-- >0){
            String s=sc.nextLine().trim();
            String[] arr=s.split("\\s+");

            String res="";
            res+=arr[arr.length-1].toLowerCase();
            for(int i=0;i<arr.length-1;i++){
                res+=Character.toLowerCase(arr[i].charAt(0));
            }
            if(map.containsKey(res)){
                int cnt=map.get(res);
                map.put(res,cnt+1);
                res+=map.get(res)+"@ptit.edu.vn";
                System.out.println(res);
            }else{
                System.out.println(res+"@ptit.edu.vn");
                map.put(res,1);
            }
        }
    }
}
