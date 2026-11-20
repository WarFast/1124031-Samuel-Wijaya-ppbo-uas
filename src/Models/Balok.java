package Models;

public class Balok extends Object3D {
    private final double panjang;
    private final double lebar;
    private final double tinggi;
    public Balok(String label, double panjang, double lebar, double tinggi) {
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return (panjang*lebar*2)+(lebar*tinggi*2)+(panjang*tinggi*2) ;
    }

    @Override
    public double hitungVolume() {
        return panjang*lebar*tinggi;
    }
    @Override
    public String getKeyValueDetails() {
        return getLabel();
    }
}
