package Models;

public class Lingkaran extends Object2D {
    private final  double jarijari;
    public Lingkaran(String label, double jarijari) {
        super(label);
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuas() {
        return 3.14 * jarijari*jarijari;
    }

    @Override
    public double hitungKeliling() {
        return 3.14*jarijari*2;
    }

    @Override
    public String getKeyValueDetails() {
        return "";
    }
}
