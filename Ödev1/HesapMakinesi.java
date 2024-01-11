package Ödev1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayıyı alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        double sayi2 = scanner.nextDouble();

        // Kullanıcıya işlem seçme
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        int secim = scanner.nextInt();

        // İşlemi gerçekleştirme ve sonucu ekrana bastırma
        double sonuc = 0;
        if (secim == 1) {
            sonuc = sayi1 + sayi2;
        } else if (secim == 2) {
            sonuc = sayi1 - sayi2;
        } else if (secim == 3) {
            sonuc = sayi1 * sayi2;
        } else if (secim == 4) {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                return;
            }
        } else {
            System.out.println("Geçersiz işlem seçimi!");
            return;
        }

        System.out.println("Sonuç: " + sonuc);

        scanner.close();
    }
}
