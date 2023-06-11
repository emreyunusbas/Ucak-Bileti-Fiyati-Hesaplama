import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double birimFiyat = 0.10;
        double toplamTutar = mesafe * birimFiyat;

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                toplamTutar *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                toplamTutar *= 0.9; // %10 indirim
            } else if (yas > 65) {
                toplamTutar *= 0.7; // %30 indirim
            }

            if (yolculukTipi == 2) {
                toplamTutar *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}
