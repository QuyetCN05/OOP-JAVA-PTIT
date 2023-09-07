import java.util.*;

class time{
    private int hour;
    private int minute;
    private int second;

    public time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
     return this.hour+" "+this.minute+" "+this.second;
    }
}
public class J05003 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        List<time> arr= new ArrayList<>();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            time t= new time(a,b,c);
            arr.add(t);
        }
        Collections.sort(arr, new Comparator<time>() {
            @Override
            public int compare(time o1, time o2) {
                if(o1.getHour() != o2.getHour()){
                    return o1.getHour()-o2.getHour();
                }else{
                    if(o1.getMinute()==o2.getMinute()){
                        return o1.getSecond()-o2.getSecond();
                    }else{
                        return o1.getMinute()-o2.getMinute();
                    }
                }
            }
        });
        for (time j: arr){
            System.out.println(j);
        }
    }
}
