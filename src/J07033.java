import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class sinhVien_1{
    private String ma;
    private String ten;
    private String lop;
    private String mail;

    public sinhVien_1(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return ma;
    }
    public void normal(){
        String[] arr=this.ten.split("\\s+");
        String res="";
        for(String x: arr){
            res+=Character.toUpperCase(x.charAt(0));
            for(int j=1;j<x.length();j++){
                res+=Character.toLowerCase(x.charAt(j));
            }
            res+=" ";
        }
        this.ten=res.substring(0,res.length()-1);

    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.lop+" "+this.mail;
    }
}
public class J07033 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc= new Scanner(new File("SINHVIEN.in"));
        List<sinhVien_1> arr= new ArrayList<>();
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine().trim();
            String lop=sc.nextLine();
            String mail=sc.nextLine();
            sinhVien_1 v= new sinhVien_1(ma,ten,lop,mail);
            v.normal();
            arr.add(v);
        }
        Collections.sort(arr, new Comparator<sinhVien_1>() {
            @Override
            public int compare(sinhVien_1 o1, sinhVien_1 o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(sinhVien_1 j: arr){
            System.out.println(j);
        }

    }
}
