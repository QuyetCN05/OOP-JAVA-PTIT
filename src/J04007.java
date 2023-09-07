import java.util.Scanner;

class nhanVien{
    private String ma;
    private String name;
    private String gender;
    private String date;
    private String address;
    private String tax;
    private String day;

    public nhanVien(String name, String gender, String date, String address, String tax, String day) {
        this.ma="00001";
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.day = day;
    }

    @Override
    public String toString() {
       return this.ma+" "+this.name+" "+this.gender
               +" "+this.date+" "+this.address+" "+this.tax
               +" "+this.day;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ten=sc.nextLine();
        String gender=sc.nextLine();
        String date=sc.nextLine();
        String dc=sc.nextLine();
        String tax=sc.nextLine();
        String s=sc.nextLine();
        nhanVien vt= new nhanVien(ten,gender,date,dc,tax,s);
        System.out.println(vt);

    }
}
