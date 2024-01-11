package Ödev1;

import java.util.Scanner;

public class TekCift {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı girişi isteme
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Tek mi yoksa çift mi olduğunu belirleme
        if (sayi % 2 == 0) {
            System.out.println(sayi + " sayısı çifttir.");
        } else {
            System.out.println(sayi + " sayısı tektir.");
        }

        scanner.close();
    }
}
