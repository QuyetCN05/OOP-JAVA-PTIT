import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class matHang{
    private String ma;
    private String ten;
    private String nhom;
    private double mua;
    private double ban;

    public matHang(int ma, String ten, String nhom, double mua, double ban) {
        this.ma = "MH"+String.format("%02d",ma);
        this.ten = ten;
        this.nhom = nhom;
        this.mua = mua;
        this.ban = ban;
    }
    public double getLai(){
        return this.ban-this.mua;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.nhom+" "+String.format("%.2f",this.getLai());
    }
}
public class j07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("DATA.in"));
        List<matHang> arr= new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++){

            String ten=sc.nextLine();
            String nhom=sc.nextLine();
            double mua=Double.parseDouble(sc.nextLine());
            double ban=Double.parseDouble(sc.nextLine());
            matHang v= new matHang(i+1,ten,nhom,mua,ban);
            arr.add(v);
        }
        Collections.sort(arr, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                if(o2.getLai()<o1.getLai()){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
        for(matHang i: arr){
            System.out.println(i);
        }

    }
}
