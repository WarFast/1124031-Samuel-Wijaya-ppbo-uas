package View;

public class GObjectFormturunan extends GObjectForm<GObjectFormturunan>{
    public GObjectFormturunan() {

    }

    @Override
    protected String[] getFields() {
        return new String[]{"nilai"};
    }

    @Override
    protected GObjectFormturunan constructModelFromValues(String label, double[] values) {
        return null;
    }

    @Override
    protected double[] extractValuesFromModel(GObjectFormturunan model) {
        return new double[0];
    }
}
