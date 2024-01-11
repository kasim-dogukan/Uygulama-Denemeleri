package Ödev1;

import java.util.Scanner;

public class GeometrikSekilAlanHesaplama {
    public static void main(String[] args) {
        // Kullanıcıya hangi geometrik şeklin alanını hesaplamak istediğini sorma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi geometrik şeklin alanını hesaplamak istersiniz?");
        System.out.println("1. Dikdörtgen");
        System.out.println("2. Kare");
        System.out.println("3. Üçgen");
        int secim = scanner.nextInt();

        // Alanı hesaplamak için gerekli bilgileri almak
        double alan = 0;
        switch (secim) {
            case 1:
                System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
                double uzunKenar = scanner.nextDouble();
                System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
                double kisaKenar = scanner.nextDouble();
                alan = uzunKenar * kisaKenar;
                break;
            case 2:
                System.out.print("Karenin kenar uzunluğunu giriniz: ");
                double kenar = scanner.nextDouble();
                alan = kenar * kenar;
                break;
            case 3:
                System.out.print("Üçgenin taban uzunluğunu giriniz: ");
                double taban = scanner.nextDouble();
                System.out.print("Üçgenin yüksekliğini giriniz: ");
                double yukseklik = scanner.nextDouble();
                alan = (taban * yukseklik) / 2;
                break;
            default:
                System.out.println("Geçersiz seçim!");
                break;
        }

        // Sonucu ekrana bastırma
        System.out.println("Seçtiğiniz geometrik şeklin alanı: " + alan);
3
        scanner.close();
    }
}
