import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class mh{
    private String ma;
    private String ten;
    private int tc;

    public mh(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.tc;
    }
}
public class J07034 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("MONHOC.in"));
        List<mh> arr= new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            int tc=sc.nextInt();
            mh s= new mh(ma,ten,tc);
            arr.add(s);
        }
        Collections.sort(arr, new Comparator<mh>() {
            @Override
            public int compare(mh o1, mh o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for(mh j: arr){
            System.out.println(j);
        }

    }
}
