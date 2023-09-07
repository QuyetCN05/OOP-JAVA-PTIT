import java.util.HashSet;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> set= new HashSet<Character>();
        for(Character x: s.toCharArray()){
            set.add(x);
        }
        System.out.println(set.size());

    }
}
