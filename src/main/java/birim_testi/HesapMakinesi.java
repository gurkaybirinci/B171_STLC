package birim_testi;

public class HesapMakinesi {
    public int topla(int a, int b) {
        return a + b;
    }

    public int cikar(int a, int b) {
        return a - b;
    }

    public int carp(int a, int b) {
        return a * b;
    }

    public double bol(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Bölen sıfır olamaz!");
        }
        return a / b;
    }
}
