import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int cnt=0;
        for(char i: s.toCharArray()){
            if(i=='4' || i=='7'){
                cnt++;
            }
        }
        if(cnt==4 || cnt==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
