package Ödev1;

import java.util.Scanner;

public class KDVTutariHesaplama {
    public static void main(String[] args) {
        // KDV oranları
        double KDV_ORANI_1 = 0.10;  // %10
        double KDV_ORANI_2 = 0.22;  // %22

        // KDV tutarını hesaplamak için değişken
        double kdvTutari;

        // Kullanıcıdan tutar bilgisini alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen tutarı giriniz: ");
        double tutar = scanner.nextDouble();

        // KDV oranını belirleme ve KDV tutarını hesaplama
        if (tutar >= 0 && tutar <= 1000) {
            kdvTutari = tutar * KDV_ORANI_1;
        } else {
            kdvTutari = tutar * KDV_ORANI_2;
        }

        // Sonuçları ekrana bastırma
        System.out.println("Girilen Tutar: " + tutar);
        System.out.println("Hesaplanan KDV Tutarı: " + kdvTutari);

        scanner.close();
    }
}
