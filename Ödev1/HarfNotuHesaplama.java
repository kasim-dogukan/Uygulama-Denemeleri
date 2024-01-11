package Ödev1;

import java.util.Scanner;

public class HarfNotuHesaplama {
    public static void main(String[] args) {
        // Kullanıcıdan sınav notunu alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen sınav notunuzu giriniz: ");
        int sinavNotu = scanner.nextInt();

       //harf notu hesaplama
        String harfNotu;
        if (sinavNotu >= 90 && sinavNotu <= 100) {
            harfNotu = "AA";
        } else if (sinavNotu >= 80 && sinavNotu < 90) {
            harfNotu = "BA";
        } else if (sinavNotu >= 70 && sinavNotu < 80) {
            harfNotu = "BB";
        } else if (sinavNotu >= 60 && sinavNotu < 70) {
            harfNotu = "CB";
        } else if (sinavNotu >= 50 && sinavNotu < 60) {
            harfNotu = "CC";
        } else if (sinavNotu >= 0 && sinavNotu < 50) {
            harfNotu = "FF";
        } else {
            harfNotu = "Geçersiz not girişi!";
        }

        // Sonucu ekrana bastırma
        System.out.println("Harf Notunuz: " + harfNotu);

        scanner.close();
    }
}
