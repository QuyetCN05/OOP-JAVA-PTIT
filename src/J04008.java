import java.util.Scanner;
class tamGiac{
    private double x;
    private double y;

    public tamGiac(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public tamGiac(tamGiac z){
        this.x=z.x;
        this.y=z.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getDistance(tamGiac v){
        return Math.sqrt(Math.pow((this.getX()-v.x),2)+Math.pow((this.getY()-v.y),2));
    }
    public double tinh(tamGiac a,tamGiac b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }

    @Override
    public String toString() {
        return this.x+" "+this.y;
    }
}
public class J04008 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double e=sc.nextDouble();
            double f=sc.nextDouble();
            tamGiac x= new tamGiac(a,b);
            tamGiac y=new tamGiac(c,d);
            tamGiac z=new tamGiac(e,f);
            double n=x.getDistance(y);
            double m=x.getDistance(z);
            double p=y.getDistance(z);
            if((n<m+p) &&(m<n+p) &&(p<n+m)){
                double cv=(n+m+p);

                System.out.printf("%.3f \n",cv);
            }else{
                System.out.println("INVALID");
            }

        }

    }
}
