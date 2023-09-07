import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class enterprise{
    private String ma;
    private  String ten;
    private int number;

    public enterprise(String ma, String ten, int number) {
        this.ma = ma;
        this.ten = ten;
        this.number = number;
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.number;
    }
}
public class J07037 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DATA.in"));
        int n=sc.nextInt();

        List<enterprise> arr= new ArrayList<>();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int number=sc.nextInt();
            enterprise v= new enterprise(ma,ten,number);
            arr.add(v);
        }
        Collections.sort(arr, new Comparator<enterprise>() {
            @Override
            public int compare(enterprise o1, enterprise o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(enterprise x: arr){
            System.out.println(x);
        }



    }
}
