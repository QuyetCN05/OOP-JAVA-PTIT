import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class monHoc{
    private String ma;
    private String ten;
    private String hinhThuc;

    public monHoc(String ma, String ten, String hinhThuc) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    @Override
    public String toString() {
        return this.getMa()+" "+this.getTen()+" "+this.getHinhThuc();
    }
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SV.in"));
        int t=sc.nextInt();
        sc.nextLine();
        List<monHoc> arr= new ArrayList<>();
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            String ht=sc.nextLine();
            monHoc s= new monHoc(ma,ten,ht);
            arr.add(s);
        }
        Collections.sort(arr, new Comparator<monHoc>() {
            @Override
            public int compare(monHoc o1, monHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(monHoc s: arr){
            System.out.println(s);
        }
    }
}

