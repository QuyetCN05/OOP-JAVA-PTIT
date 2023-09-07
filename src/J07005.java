import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] f = new int[1005];
        for (int i = 0; i < 100000; ++i)
            ++f[sc.readInt()];
        for (int i = 0; i <= 1000; ++i)
            if (f[i] > 0)
                System.out.println(i + " " + f[i]);


    }
}