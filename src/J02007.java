import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){

            int n=sc.nextInt();
            LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                if(map.containsKey(x)){
                    map.put(x,map.get(x)+1);
                }else{
                    map.put(x,1);
                }

            }
            System.out.println("Test "+i+":");
            Set<Map.Entry<Integer,Integer>> entrySet= map.entrySet();
            for(Map.Entry<Integer,Integer> entry: entrySet){
                System.out.println(entry.getKey()+" xuat hien "+entry.getValue()+" lan");
            }
        }


    }
}
