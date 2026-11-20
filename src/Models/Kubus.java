package Models;

public class Kubus extends Object3D {
    private final  double sisi;
    public Kubus(String label, double sisi) {
        super(label);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return sisi*sisi*6;
    }

    @Override
    public double hitungVolume() {
        return sisi*sisi*sisi;
    }
    @Override
    public String getKeyValueDetails() {
        return "";
    }
}
