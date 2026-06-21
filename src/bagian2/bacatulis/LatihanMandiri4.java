package bagian2.bacatulis;
import java.io.*;

public class LatihanMandiri4 {
    public static void main(String[] args) {
        
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        try (PrintWriter pw = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) pw.println(h);
            System.out.println("5 nama hari berhasil ditulis.");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        
        try (BufferedReader br = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            System.out.println("Isi hari.txt:");
            while ((baris = br.readLine()) != null) System.out.println(baris);
        } catch (IOException e) { System.out.println(e.getMessage()); }
    }
}

