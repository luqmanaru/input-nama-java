package latihan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan2 {
    private static String nama;

    public static void main(String[] args) {
        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ketik Nama Anda : ");
        try {
            nama = dataln.readLine();
        } catch(IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input!");
            return;
        }

        System.out.println("Halo " + nama + "!");
    }
}
