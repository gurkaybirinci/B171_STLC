package birim_testi;

import org.junit.Assert;
import org.junit.Test;

public class BirimTestiProgramiTesti {
    @Test
    public void toplamHesaplaTesti(){
        BirimTestiProgrami program = new BirimTestiProgrami();
        int[] sayilar = {5, 10, 15, 20, 25};

        int beklenenToplam = 5 + 10 + 15 + 20 + 25;
        int gercekToplam = program.toplamHesapla(sayilar);

        Assert.assertEquals(beklenenToplam, gercekToplam);
    }

    @Test
    public void ortalamaHesapla(){
        BirimTestiProgrami program = new BirimTestiProgrami();
        int[] sayilar = {5, 10, 15, 20, 25};

        double beklenenOrtalama = (5 + 10 + 15 + 20 + 25) / 5.0;
        double gercekOrtalama = program.ortalamaHesapla(sayilar);

        Assert.assertEquals(beklenenOrtalama, gercekOrtalama, 0.0001);
    }

    @Test
    public void enBuyukbulTesti(){
        BirimTestiProgrami program = new BirimTestiProgrami();
        int[] sayilar = {5, 10, 15, 20, 25};

        int beklenenEnBuyuk = 25;
        int gercekEnBuyuk = program.enBuyukBul(sayilar);

        Assert.assertEquals(beklenenEnBuyuk, gercekEnBuyuk);
    }
}