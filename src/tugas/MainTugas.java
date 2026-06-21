// ============================================
// Nama : Muhammad Hersa Sugiannor
// NPM  : 2410010253
// ============================================
package tugas;

public class MainTugas {
    public static void main(String[] args) {

        String[] kategori = {"Sembako", "Elektronik", "Pakaian"};
        System.out.println("===== Kategori Barang =====");
        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i+1) + ". " + kategori[i]);
        }
        System.out.println();

        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Beras",     12500.0, 50));
        gudang.tambahBarang(new Barang("Minyak",    20000.0, 30));
        gudang.tambahBarang(new Barang("Gula",      15000.0, 40));
        gudang.tambahBarang(new Barang("Tepung",    10000.0, 25));
        gudang.tambahBarang(new Barang("Telur",     28000.0, 60));

        gudang.tampilkanSemua();
        System.out.println("Total Nilai Persediaan: Rp" + gudang.totalNilai());
        System.out.println();

        gudang.simpanKeBerkas();  
        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        System.out.println();
        gudangBaru.tampilkanSemua();
        System.out.println("Total Nilai Persediaan: Rp" + gudangBaru.totalNilai());
    }
}
