package Models;

public class Persegi extends Object2D{
    private final double sisi;
    public Persegi(String label, double sisi) {
        super(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }

    @Override
    public double hitungKeliling() {
        return sisi*4;
    }

    @Override
    public String getKeyValueDetails() {
        return "";
    }
}
