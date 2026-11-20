package View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class GObjectForm<T> {
    private List<T> records;
private Scanner scanner;
public GObjectForm() {
this.records = new ArrayList<>();
this.scanner = new Scanner(System.in);
}
public void showInsertform(){
    String[] fields = getFields();
    double[] values = new double[fields.length];

    for (int i = 0; i < fields.length; i++) {
        System.out.print("Masukkan " + fields[i] + ": ");
        values[i] = scanner.nextDouble();
    }

    try {
        T newData = constructModelFromValues("label",values);
        records.add(newData);
        System.out.println("Data berhasil ditambahkan.");

    } catch (NumberFormatException e) {
        System.out.println("Input angka tidak valid. Data gagal ditambahkan.");
    }
}
    protected abstract String[] getFields();
    protected abstract T constructModelFromValues(String label, double[] values);
    protected abstract double[] extractValuesFromModel(T model);
}
