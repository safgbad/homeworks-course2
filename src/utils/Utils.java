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
        }
        System.out.println();
    }
}
