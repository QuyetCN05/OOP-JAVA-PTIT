import java.util.Scanner;

class circle {
    private double x;
    private double y;

    public circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public circle(circle z) {
        this.x = z.x;
        this.y = z.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(circle v) {
        return Math.sqrt(Math.pow((this.getX() - v.x), 2) + Math.pow((this.getY() - v.y), 2));
    }

    public double tinh(circle a, circle b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

}

public class J04010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double e=sc.nextDouble();
            double f=sc.nextDouble();
            circle x= new circle(a,b);
            circle y= new circle(c,d);
            circle z= new circle(e,f);
            double n=x.getDistance(y);
            double m=x.getDistance(z);
            double p=y.getDistance(z);
            double cv=(n+m+p)/2;
            if((n<m+p) && (p<m+n) && (m<p+n)){
                double s=Math.sqrt(cv*(cv-n)*(cv-m)*(cv-p));
                double r=(n*m*p)/(4*s);
                System.out.printf("%.3f \n",Math.PI*r*r);
            }else{
                System.out.println("INVALID");
            }
        }

    }
}
