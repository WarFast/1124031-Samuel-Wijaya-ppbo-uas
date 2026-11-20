package Models;

public class SegiEmpat extends Object2D {
    private final  double panjang;
    private final double lebar;
    public SegiEmpat(String label, double panjang, double lebar) {
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return panjang*2+lebar*2;
    }

    @Override
    public String getKeyValueDetails() {
        return "";
    }
}
