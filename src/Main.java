import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String lop=sc.nextLine();
        String date=sc.nextLine();
        double diem=sc.nextDouble();
        Student s= new Student(name,lop,date,diem);
        s.chuanHoa();
        System.out.println(s);
    }
}