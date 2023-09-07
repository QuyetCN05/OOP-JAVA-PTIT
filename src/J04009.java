import java.util.Scanner;

class tg {
    private double x;
    private double y;

    public tg(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public tg(tg z) {
        this.x = z.x;
        this.y = z.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(tg v) {
        return Math.sqrt(Math.pow((this.getX() - v.x), 2) + Math.pow((this.getY() - v.y), 2));
    }

    public double tinh(tg a, tg b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }
}

public class J04009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double e=sc.nextDouble();
            double f=sc.nextDouble();
            tg x=new tg(a,b);
            tg y=new tg(c,d);
            tg z= new tg(e,f);
            double p=x.getDistance(y);
            double q=x.getDistance(z);
            double r=y.getDistance(z);
            double cv=(p+q+r)/2;
            if((p<q+r) && (r<q+p) && (q<p+r)){
                System.out.printf("%.2f \n",Math.sqrt(cv*(cv-q)*(cv-p)*(cv-r)));
            }else{
                System.out.println("INVALID");
            }

        }

    }
}
