
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class sinhVien{
    private String ma;
    private String ten;
    private String date;
    private String lop;
    private double gpa;

    public sinhVien(int ma, String ten, String date, String lop, double gpa) {
        this.ma = "B20DCCN"+String.format("%03d",ma);
        this.ten = ten;
        this.date = date;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void chuanHoa(){
        String[] arr=this.ten.split("\\s+");
        String res="";
        for(String x: arr){
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++ ){
                res+=Character.toLowerCase(x.charAt(i));
            }
            res+=" ";
        }
        this.ten=res.substring(0,res.length()-1);
        StringBuilder sb= new StringBuilder(this.date);
        if(sb.charAt(1) == '/') sb.insert(0, "0");
        if(sb.charAt(4) == '/') sb.insert(3, "0");
        this.date=sb.toString();
    }

    @Override
    public String toString() {
        return this.getMa()+" "+this.getTen()+" "+this.getLop()+" "+this.getDate()+" "+String.format("%.2f",this.getGpa());
    }
}
public class J05033 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<sinhVien> arr= new ArrayList<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String day=sc.nextLine();
            double gpa=sc.nextDouble();
            sinhVien s= new sinhVien(i,ten,day,lop,gpa);
            s.chuanHoa();
            arr.add(s);

        }
        for(sinhVien j: arr){
            System.out.println(j);
        }

    }
}
