import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> map= new TreeMap<>();
        while(sc.hasNextInt()){
            int a=sc.nextInt();
            if(map.containsKey(a)){
                int tanSuat=map.get(a);
                ++tanSuat;
                map.put(a,tanSuat);
            }else{
                map.put(a,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
        for(Map.Entry<Integer,Integer> entry: entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
