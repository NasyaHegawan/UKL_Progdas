package UKL;

import java.util.Scanner;

public class MudahSoal2 {
    public static boolean Prima(int bilangan) {
        if (bilangan == 1) {
            return false;
        }
        for (int i = 2; i < bilangan; i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) { 
        int bilangan;
        System.out.println("\nMari belajar mengenai bilangan prima!");
        System.out.println("=====================================");

        Scanner n = new Scanner(System.in);
        System.out.println("Silahkan masukkan bilangan/angka yang ingin diketahui apakah itu bilangan prima atau bukan!");
        System.out.print("Masukkan bilangan : ");
        bilangan = n.nextInt();
        System.out.println("\nBaiklah, kamu memasukkan bilangan " + bilangan);
        System.out.println("Mari kita cek bersama-sama apakah bilangan " + bilangan + " merupakan bilangan prima?");

        if (Prima(bilangan)) {
            System.out.println("\nWow! Benar sekali");
            System.out.println("Bilangan " + bilangan + " adalah Bilangan Prima");
        } else {
            System.out.println("\nYahhh, sayang sekali");
            System.out.println("Bilangan " + bilangan + " bukan Bilangan Prima");
        }

    }

}

