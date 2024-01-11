package Ödev1;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        // KDV'siz fiyat sabiti
        double KDVSIZ_FIYAT = 10.0;

        // KDV oranı (%30)
        double KDV_ORANI = 0.30;

        // KDV'li fiyat ve KDV tutarını hesaplamak için değişkenler
        double kdvliFiyat, kdvTutari;

        // Kullanıcıdan para değerini alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen para değerini giriniz: ");
        double paraDegeri = scanner.nextDouble();

        // KDV'li fiyatı hesaplama
        kdvliFiyat = paraDegeri * (1 + KDV_ORANI);

        // KDV tutarını hesaplama
        kdvTutari = paraDegeri * KDV_ORANI;

        // Sonuçları ekrana bastırma
        System.out.println("KDV'siz Fiyat: " + KDVSIZ_FIYAT);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

        scanner.close();
    }
}
