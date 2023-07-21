package entegrasyon_testi;

import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {
    @Test
    public void toplamaTesti() {
        ModulA modulA = new ModulA();
        int sonuc = modulA.topla(5, 3);

        Assert.assertEquals(8, sonuc);
    }

    @Test
    public void cikarmaTesti() {
        ModulB modulB = new ModulB();
        int sonuc = modulB.cikar(5, 3);

        Assert.assertEquals(2, sonuc);
    }

    @Test
    public void carpmaTesti(){
        ModulC modulC = new ModulC();
        int sonuc = modulC.carp(5, 3);

        Assert.assertEquals(15, sonuc);
    }
}
