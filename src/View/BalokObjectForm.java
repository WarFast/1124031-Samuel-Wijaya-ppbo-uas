package View;

import Models.GObject;

public class BalokObjectForm extends GObjectForm<GObject> {
    @Override
    protected String[] getFields() {
        return new String[0];
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
