import java.util.Scanner;

class Rectangle{
    private int width;
    private int length;
    private String color;
    public Rectangle(){
        this.width=1;
        this.length=1;
    }

    public Rectangle(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getArea(){
        return this.length*this.width;
    }
    public int getPerimeter(){
        return 2*(this.length+this.width);
    }
    public void chuanHoa(){
        StringBuilder sb= new StringBuilder(this.color);
        String res="";
        res+=Character.toUpperCase(sb.charAt(0));
        for(int j=1;j<sb.length();j++){
            res+=Character.toLowerCase(sb.charAt(j));
        }
        this.color=res;
    }


    @Override
    public String toString() {
        return this.getPerimeter()+" "+this.getArea()+" "+this.getColor();
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String color=sc.next();
        if( a> 0 && b >0){
            Rectangle s= new Rectangle(a,b,color);
            s.chuanHoa();
            System.out.println(s);
        }else{
            System.out.println("INVALID");
        }

    }
}
