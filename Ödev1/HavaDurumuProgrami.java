package Ödev1;

import java.util.Scanner;

public class HavaDurumuProgrami {
    public static void main(String[] args) {
        // Kullanıcıdan hava durumu kodunu alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen hava durumu kodunu giriniz: ");
        int havaDurumuKodu = scanner.nextInt();

        // Hava durumu koduna göre durumu belirleme
        String havaDurumu = "";
        switch (havaDurumuKodu) {
            case 1:
                havaDurumu = "Güneşli";
                break;
            case 2:
                havaDurumu = "Parçalı Bulutlu";
                break;
            case 3:
                havaDurumu = "Bulutlu";
                break;
            case 4:
                havaDurumu = "Yağmurlu";
                break;
            case 5:
                havaDurumu = "Karlı";
                break;
            default:
                havaDurumu = "Geçersiz hava durumu kodu";
        }

        // Sonucu ekrana bastırma
        System.out.println("Hava Durumu: " + havaDurumu);

        scanner.close();
    }
}
