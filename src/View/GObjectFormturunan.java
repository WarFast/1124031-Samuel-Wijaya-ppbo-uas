package View;

import Models.GObject;

public class GObjectFormturunan extends GObjectForm<GObject>{
    public GObjectFormturunan() {

    }

    @Override
    protected String[] getFields() {
        return new String[]{"nilai"};
    }

    @Override
    protected GObject constructModelFromValues(String label, double[] values) {
        return null;
    }

    @Override
    protected double[] extractValuesFromModel(GObject model) {
        return new double[0];
    }

    @Override
    protected double[] extractValuesFromModel(GObjectFormturunan model) {
        return new double[0];
    }
}
