package birim_testi;

public class BirimTestiProgrami {
    public int toplamHesapla(int[] sayilar) {
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
        }
        return toplam;
    }

    public double ortalamaHesapla(int[] sayilar) {
        int toplam = 0;
        for (int i = 1; i <= sayilar.length; i++) {
            toplam += sayilar[i]; // Hatalı indeks
        }
        return toplam / sayilar.length;
    }

    public int enBuyukBul(int[] sayilar) {
        int enBuyuk = sayilar[0];
        for (int i = 1; i <= sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        return enBuyuk;
    }

    public int[] ciftSayilariBul(int[] sayilar) {
        int[] ciftler = new int[sayilar.length];
        int index = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 == 0) {
                ciftler[index] = sayilar[i];
                index++;
            }
        }
        return ciftler;
    }

    public static void main(String[] args) {
        BirimTestiProgrami program = new BirimTestiProgrami();
        int[] sayilar = {5, 10, 15, 20, 25};

        int toplam = program.toplamHesapla(sayilar);
        System.out.println("Dizideki Sayıların Toplamı: " + toplam);

        double ortalama = program.ortalamaHesapla(sayilar);
        System.out.println("Dizideki Sayıların Ortalaması: " + ortalama);

        int enBuyuk = program.enBuyukBul(sayilar);
        System.out.println("Dizideki En Büyük Sayı: " + enBuyuk);

        int[] ciftler = program.ciftSayilariBul(sayilar);
        System.out.println("Dizideki Çift Sayılar: ");
        for (int i = 0; i < ciftler.length; i++) {
            System.out.print(ciftler[i] + " ");
        }
    }
}