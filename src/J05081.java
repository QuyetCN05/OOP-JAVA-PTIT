import java.util.*;

class Items {
    private String ma;
    private String name;
    private String donVi;
    private int giaMua;
    private int giaBan;

    public Items(int ma, String name, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.name = name;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getLoiNhuan() {
        return this.giaBan - this.giaMua;
    }

    @Override
    public String toString() {
        return this.getMa() + " " + this.name + " " + this.donVi + " " +
                +this.getGiaMua() + " " + this.getGiaBan() + " " + this.getLoiNhuan();
    }
}

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Items> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String dv = sc.nextLine();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            Items vt = new Items(i + 1, ten, dv, mua, ban);
            arr.add(vt);

        }
        Collections.sort(arr, new Comparator<Items>() {
            @Override
            public int compare(Items o1, Items o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan()) {
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                } else {
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        for (Items t : arr) {
            System.out.println(t);
        }

    }
}
