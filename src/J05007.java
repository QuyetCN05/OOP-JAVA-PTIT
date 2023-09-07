import java.util.*;

class nv{
    private String ma;
    private String ten;
    private String gender;
    private String date;
    private String address;
    private String tax;
    private String day;

    public nv(int ma, String ten, String gender, String date, String address, String tax, String day) {
        this.ma = String.format("%05d",ma);
        this.ten = ten;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.tax = tax;
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+
                this.gender+" "+this.date+" "+this.address+" "
                +this.tax+" "+this.day;
    }
}
public class J05007 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<nv> arr= new ArrayList<>();
        for(int i=1;i<=n;i++){
            String ten=sc.nextLine();
            String gt=sc.nextLine();
            String date=sc.nextLine();
            String dc=sc.nextLine();
            String tax=sc.nextLine();
            String day=sc.nextLine();
            nv s= new nv(i,ten,gt,date,dc,tax,day);
            arr.add(s);
        }
        Collections.sort(arr, new Comparator<nv>() {
            @Override
            public int compare(nv o1, nv o2) {
                String[] a=o1.getDate().split("/");
                String[] b=o2.getDate().split("/");
                String res_1=a[2]+a[1]+a[0];
                String res_2=b[2]+b[1]+b[0];
                return res_1.compareTo(res_2);
            }
        });
        for(nv j: arr){
            System.out.println(j);
        }



    }
}
