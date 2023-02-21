package temelKavramlar;

import java.util.Scanner;

public class notOrtalamaHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        int matematik = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        int muzik = scanner.nextInt();

        // Not ortalamasını hesapla
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        // Koşullu ifadelerle sınıf geçme durumunu belirle ve ekrana yazdır
        if (ortalama >= 60) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }
    }
}
