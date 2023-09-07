import java.util.Scanner;
class gv{
    private String ma;
    private String name;
    private int heSo;
    private int luongCoBan;
    private int phuCap;

    public gv(String ma, String name, int heSo, int luongCoBan,int phuCap) {
        this.ma = ma;
        this.name = name;
        this.heSo = heSo;
        this.luongCoBan = luongCoBan;
        this.phuCap=phuCap;
    }

    public String getMa() {
        return ma;
    }

    public String getName() {
        return name;
    }

    public int getHeSo() {
        return heSo;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(int phuCap) {
        this.phuCap = phuCap;
    }

    @Override
    public String toString() {
        return this.getMa()+" "+this.getName()+" "+this.getHeSo()
                +" "+this.getPhuCap()+" "+this.getLuongCoBan();
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String tmp=sc.nextLine();
        String str=tmp;
        String a=tmp;
        String ten=sc.nextLine();
        int luong=sc.nextInt();
        String s=tmp.substring(0,2);
        if(s.equals("HP")){
            int phuCap=900000;
            int heSo=Integer.parseInt(str.substring(2,4));
            int sum=phuCap+luong*heSo;
            gv st= new gv(a,ten,heSo,sum,phuCap);
            System.out.println(st);



        }else if(s.equals("HT")){
            int phuCap=2000000;
            int heSo=Integer.parseInt(str.substring(2,4));
            int sum=phuCap+luong*heSo;
            gv st= new gv(a,ten,heSo,sum,phuCap);
            System.out.println(st);
        }else{
            int phuCap=500000;
            int heSo=Integer.parseInt(str.substring(2,4));
            int sum=phuCap+luong*heSo;
            gv st= new gv(a,ten,heSo,sum,phuCap);
            System.out.println(st);
        }









    }
}
