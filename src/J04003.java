import java.util.Scanner;

class phanSo{
    private long tu;
    private long mau;

    public phanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long gcd(long a,long b){
        while(b !=0){
            long r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    @Override
    public String toString() {
        return this.tu/(gcd(this.tu,this.mau))+"/"+this.mau/(gcd(this.tu,this.mau));
    }
}
public class J04003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        phanSo s= new phanSo(a,b);
        System.out.println(s);

    }
}
