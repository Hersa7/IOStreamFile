package bagian2.bacatulis;
import java.io.*;

public class LatihanMandiri5 {
    public static void main(String[] args) {
        
        try (PrintWriter pw = new PrintWriter(new FileWriter("hari.txt", true))) {
            pw.println("Sabtu");
            pw.println("Minggu");
            System.out.println("2 hari ditambahkan.");
        } catch (IOException e) { System.out.println(e.getMessage()); }

        try (BufferedReader br = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            System.out.println("Seluruh isi hari.txt:");
            while ((baris = br.readLine()) != null) System.out.println(baris);
        } catch (IOException e) { System.out.println(e.getMessage()); }
    }
}
