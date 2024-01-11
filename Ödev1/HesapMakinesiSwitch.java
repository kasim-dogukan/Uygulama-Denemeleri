package Ödev1;

import java.util.Scanner;

public class HesapMakinesiSwitch {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayıyı alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
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
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Toplama Sonucu: " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Çıkarma Sonucu: " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Çarpma Sonucu: " + sonuc);
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                    System.out.println("Bölme Sonucu: " + sonuc);
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
        }

        // Scanner kapatma
        scanner.close();
    }
}
