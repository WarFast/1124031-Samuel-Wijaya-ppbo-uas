package Models;

public class Kerucut extends Object3D {
    private final  double jarijari;
    private final double tinggi;
    public Kerucut(String label, double sisi, double jarijari, double tinggi) {
        super(label);
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    @Override
    public double hitungVolume() {
        return 0;
    }
    @Override
    public String getKeyValueDetails() {
        return getKeyValueDetails();
    }
}


