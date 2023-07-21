package entegrasyon_testi;

public class ModulC {
    public int carp(int a, int b) {
        ModulA modulA = new ModulA();
        ModulB modulB = new ModulB();
        return modulA.topla(a, b) * modulB.cikar(a, b);
    }
}
