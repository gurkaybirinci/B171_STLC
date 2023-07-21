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
        for (int i = 1; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        return toplam / sayilar.length;
    }

    public int enBuyukBul(int[] sayilar) {
        int enBuyuk = sayilar[0];
        for (int i = 0; i < sayilar.length-1; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        return enBuyuk;
    }

    public static void main(String[] args) {
        BirimTestiProgrami program = new BirimTestiProgrami();
        int[] sayilar = {25, 15, 5, 10, 20};

        int toplam = program.toplamHesapla(sayilar);
        System.out.println("Arraydeki Sayıların Toplamı: " + toplam);

        double ortalama = program.ortalamaHesapla(sayilar);
        System.out.println("Arraydeki Sayıların Ortalaması: " + ortalama);

        int enBuyuk = program.enBuyukBul(sayilar);
        System.out.println("Arraydeki En Büyük Sayı: " + enBuyuk);
    }
}