package UKL;

import java.util.Scanner;

public class SulitSoal2 {
    public static void main(String[] args) {
        System.out.println("=== MENCARI ELEMEN NEGATIF DI ARRAY ===");
        System.out.println();

        Scanner n = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen array : ");
        int jumlahEl = n.nextInt();

        int[] cek = new int[jumlahEl];

        System.out.println("\nMasukkan elemen array yang ingin dicek : ");
        for (int i = 0; i < jumlahEl; i++) {
            System.out.println("Elemen ke- " + (i + 1));
            cek[i] = n.nextInt();
        }

        String ElNegatif = "";

        for (int a = 0; a < cek.length; a++) {
            if (cek[a] < 0) {
                if (!ElNegatif.isEmpty()) {
                    ElNegatif += ", ";
                }

                ElNegatif += cek[a];
            }
        }

        System.out.println();
        if (!ElNegatif.isEmpty()) {
            System.out.println("Array mengandung elemen negatif : " + ElNegatif);
        } else {
            System.out.println("Array tidak mengandung elemen negatif");
        }

        n.close();

    }
} 
