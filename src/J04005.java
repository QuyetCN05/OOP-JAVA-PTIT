import java.util.Scanner;

class thiSinh{
    private String name;
    private String date;
    private double diem_1;
    private double diem_2;
    private double diem_3;

    public thiSinh(String name, String date, double diem_1, double diem_2, double diem_3) {
        this.name = name;
        this.date = date;
        this.diem_1 = diem_1;
        this.diem_2 = diem_2;
        this.diem_3 = diem_3;
    }

    @Override
    public String toString() {
        return this.name+" "+this.date+" "+String.format("%.1" +
                "" +
                "f",this.diem_1+this.diem_2+this.diem_3);
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String ten=sc.nextLine();
        String day=sc.nextLine();
        double diem_1=sc.nextDouble();
        double diem_2=sc.nextDouble();
        double diem_3=sc.nextDouble();
        thiSinh s= new thiSinh(ten,day,diem_1,diem_2,diem_3);
        System.out.println(s);

    }
}
