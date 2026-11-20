package Models;

public abstract class Object3D extends GObject{

    public Object3D(String label) {
        super(label);
    }

    @Override
    public String getKeyValueDetails() {
        return getKeyValueDetails();
    }
    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
}
