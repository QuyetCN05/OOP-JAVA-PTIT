import java.util.Scanner;

class Point{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point z){
        this.x=z.x;
        this.y=z.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double getDistance(Point v){
        return Math.sqrt(Math.pow((this.getX()-v.x),2)+Math.pow((this.getY()-v.y),2));
    }
    public double tinh(Point a,Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow((a.y-b.y),2));
    }

    @Override
    public String toString() {
        return this.x+" "+this.y;
    }
}
public class J04001 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double d=sc.nextDouble();
            double c=sc.nextDouble();
            Point v= new Point(a,b);
            Point t=new Point(d,c);
            System.out.printf("%.4f \n",v.getDistance(t));
        }
    }

}
