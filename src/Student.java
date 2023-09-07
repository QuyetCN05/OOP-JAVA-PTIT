public class Student {
    private String name;
    private String lop;
    private String date;
    private double gpa;

    public Student(String name, String lop, String date, double gpa) {
        this.name = name;
        this.lop = lop;
        this.date = date;
        this.gpa = gpa;
    }
    void chuanHoa(){
        StringBuilder sb= new StringBuilder(this.date);
        if(sb.charAt(1)=='/'){
            sb.insert(0,"0");
        }
        if(sb.charAt(4)=='/'){
            sb.insert(3,"0");
        }
        this.date=sb.toString();
    }

    @Override
    public String toString() {
       return "B20DCCN001 "+this.name+" "+this.lop+" "+this.date+" "
               +String.format("%.2f",this.gpa);
    }
}
