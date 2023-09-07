import java.util.Scanner;

class fraction{
    private long tu;
    private long mau;

    public fraction(long tu, long mau) {
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
    public long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public fraction tong(fraction x,fraction y){
        long m=lcm(x.mau,y.mau);
        long n=x.tu*(m/x.mau)+y.tu*(m/y.mau);
        fraction z= new fraction(n,m);
        return z;
    }

    @Override
    public String toString() {
      return this.tu/(gcd(this.tu,this.mau))+"/"+this.mau/(gcd(this.tu,this.mau));
    }
}
public class J04004 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        fraction x=new fraction(a,b);
        fraction y=new fraction(c,d);
        fraction z=x.tong(x,y);
        System.out.println(z);
    }

}
