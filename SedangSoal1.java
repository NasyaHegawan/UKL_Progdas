package UKL;

public class SedangSoal1 {
    public static void main(String[] args) {
        System.out.println("Mari menghitung uang tabungan!!");
        System.out.println("Mari kita cek sudah berapa banyak uang yang terkumpul!");
        System.out.println();

        int tabunganPertama = 100000;
        int kenaikanPerBulan = 50000;
        int totalTab = 0;

        // Perulangan
        for (int bulan = 1; bulan <= 12; bulan++) {
            int tabunganBulan = tabunganPertama + (kenaikanPerBulan * (bulan - 1));
            totalTab += tabunganBulan;

            System.out.println(String.format("Tabungan bulan ke- %d: Rp %,d", bulan, tabunganBulan));
        }

        System.out.println(String.format("\nTotal tabungan selama 12 bulan adalah Rp %,d", totalTab));

    }
}
