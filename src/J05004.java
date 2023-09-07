import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class st{
    private String ma;
    private String name;
    private String lop;
    private String date;
    private double gpa;

    public st(int ma, String name, String lop, String date, double gpa) {
        this.ma = "B20DCCN"+ String.format("%03d",ma);
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void  chuanHoa(){
        String[] arr= this.name.split("\\s+");
        String res="";
        for(String x: arr){
            if (x.length() > 0) { // Kiểm tra x có độ dài lớn hơn 0
                res += Character.toUpperCase(x.charAt(0));
                for(int i = 1; i < x.length(); i++){
                    res += Character.toLowerCase(x.charAt(i));
                }
                res += " ";
            }

        }
        this.name=res.substring(0,res.length()-1);
        StringBuilder sb= new StringBuilder(this.date);
        if(sb.charAt(1)=='/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3,"0");
        }
        this.date=sb.toString();
    }

    @Override
    public String toString() {
        return this.ma+" "+this.name+" "+this.lop+" "
                +this.date+" "+String.format("%.2f",this.gpa);
    }
}
public class J05004 {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<st> arr= new ArrayList<>();
        for(int i=1;i<=n;i++){

            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String day=sc.nextLine();
            double diem=Double.parseDouble(sc.nextLine());
            st v= new st(i,ten,lop,day,diem);
            v.chuanHoa();
            arr.add(v);
        }
        for(st j: arr){
            System.out.println(j);
        }
    }
}