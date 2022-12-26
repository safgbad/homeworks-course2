package utils;

import transport.Competing;
import transport.Transport;

public class Utils {
    public static boolean isStringNotNullAndNotBlank(String str) {
        return str != null && !str.isBlank();
    }

    public static void printCompeting(Competing competing) {
        System.out.println();
        System.out.println(competing);
        competing.pitStop();
        competing.bestLapTime();
        competing.maxSpeed();
        if (competing instanceof Transport
                && ((Transport) competing).getDriver() != null) {
            Transport transport = ((Transport) competing);
            System.out.println(transport.getDriver().getFullName()
                    + " управляет автомобилем " + transport.getBrand() + ' ' + transport.getModel()
                    + " и будет участвовать в заезде.");
            transport.printType();
            switch (transport.getDiagnostic()) {
                case 0:
                    throw new RuntimeException("У водителя "
                            + transport.getBrand() + ' ' + transport.getModel()
                            + "отсутствуют права!");
                case 1:
                    System.out.println(transport.getBrand() + ' ' + transport.getModel()
                            + " успешно прошло диагностику");
                    break;
                default:
                    System.out.println(transport.getBrand() + ' ' + transport.getModel()
                            + " не требует диагностики");
            }
        }
        System.out.println();
    }
}
