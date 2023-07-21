package birim_testi;

import org.junit.Assert;
import org.junit.Test;

public class HesapMakinesiTest {
    private HesapMakinesi hesapMakinesi = new HesapMakinesi();

    @Test
    public void testTopla() {
        int sonuc = hesapMakinesi.topla(5, 3);
        Assert.assertEquals(8, sonuc);
    }

    @Test
    public void testCikar() {
        int sonuc = hesapMakinesi.cikar(10, 4);
        Assert.assertEquals(6, sonuc);
    }

    @Test
    public void testCarp() {
        int sonuc = hesapMakinesi.carp(5, 6);
        Assert.assertEquals(30, sonuc);
    }

    @Test
    public void testBol() {
        double sonuc = hesapMakinesi.bol(15.0, 3.0);
        Assert.assertEquals(5.0, sonuc, 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testBolBolenSifir() {
        hesapMakinesi.bol(10.0, 0.0);
    }
}
