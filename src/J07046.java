import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class hotel implements Comparable<hotel>{
    private String ma;
    private String ten;
    private String room;
    private Long duration;

    public hotel(int ma, String ten, String room, long duration) {
        this.ma = "KH"+String.format("%02d",ma);
        this.ten = ten;
        this.room = room;
        this.duration = duration;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.ma+" "+this.ten+" "+this.room+" "+this.duration;
    }
    public int compareTo(hotel other) {
        return -duration.compareTo(other.getDuration());
    }





}
public class J07046 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc= new Scanner(new File("KHACH.in"));
        SimpleDateFormat sp= new SimpleDateFormat("dd/MM/yyyy");
        List<hotel> arr= new ArrayList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String ma=sc.nextLine();
            String ten=sc.nextLine();
            Date start=sp.parse(sc.nextLine());
            Date finish=sp.parse(sc.nextLine());
            long time=(finish.getTime()-start.getTime())/(1000L*60*60*24);
            hotel x= new hotel(i+1,ma,ten,time);
            arr.add(x);

        }
        Collections.sort(arr);

        for(hotel x: arr){
            System.out.println(x);
        }
    }
}
