package temelKavramlar;

import java.util.Scanner;

public class notOrtalamaHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        int matematik = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        int kimya = scanner.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        int turkce = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        int tarih = scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        int muzik = scanner.nextInt();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        boolean gectiMi = ortalama >= 60;
        String durum = gectiMi ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(durum);
    }
}
