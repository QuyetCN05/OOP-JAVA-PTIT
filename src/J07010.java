import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;


class sv{
    public static int num=1;

    private String msv;
    private String ten;
    private String lop;
    private String date;
    private float gpa;

    public sv( int msv, String ten, String lop, String date, float gpa) throws ParseException {
        this.msv = "B20DCCN"+String.format("%03d",msv);
        this.ten = ten;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }
    public void normal(){
        StringBuilder sb= new StringBuilder(this.date);
        if(sb.charAt(1)=='/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4)=='/') sb.insert(3,"0");
        this.date=sb.toString();
    }

    @Override
    public String toString() {
        return this.msv+" "+this.ten+" "+this.lop+" "+this.date+" "+String.format("%.2f",this.gpa);
    }
}
public class J07010 {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc= new Scanner(new File("SV.in"));
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            sc.nextLine();
            String ten=sc.nextLine();
            String lop=sc.nextLine();
            String day=sc.nextLine();
            float diem=sc.nextFloat();
            sv s= new sv(i,ten,lop,day,diem);
            s.normal();

            System.out.println(s);
        }
    }
}
