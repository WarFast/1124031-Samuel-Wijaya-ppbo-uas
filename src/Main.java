import java.util.Scanner;
import Models.*;
import View.*;
import View.PrintUtil;
import exceptions.InvalidInputException;

import static View.PrintUtil.printGObjectDetail;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GObjectForm<GObject> objectForm =new GObjectFormturunan();
    boolean running = true;
    while (running) {
        System.out.println("=== Pilih Menu===");
        System.out.println("1. tampilkan semua");
        System.out.println("2. tambah persegi");
        System.out.println("3.tambah segiempat");
        System.out.println("4.tambah lingkaran");
        System.out.println("5.tambah kubus");
        System.out.println("6.tambah balok");
        System.out.println("7.tambah kerucut");
        String menuchoice = sc.nextLine();
        switch (menuchoice) {
            case "1":
                printGObjectDetail();
                break;
                case "2":
                    break;
                    case "3":
                        break;
                        case "4":
                            break;
                            case "5":
                                break;
                                case "6":
                                    break;
                                    case "7":
                                        break;
                                            case "0":
                                                running = false;
                                                break;
            default:break;

        }
    }
    }
}