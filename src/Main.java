import stuff.Mechanic;
import stuff.driver.Driver;
import stuff.driver.drivers.DriverB;
import stuff.driver.drivers.DriverC;
import stuff.driver.drivers.DriverD;
import transport.Transport;
import transport.enums.Capacity;
import transport.enums.LoadCapacity;
import transport.transports.Bus;
import transport.transports.Car;
import transport.transports.Truck;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> transports = new ArrayList<>();
        List<Driver> drivers = new ArrayList<>();
        List<Mechanic> mechanics = new ArrayList<>();

        DriverB driver1 = new DriverB("Name1", true, 2);
        drivers.add(driver1);
        transports.add(new Car<>(
                "Lada",
                "Granta",
                1.7,
                driver1,
                null));
        DriverB driver2 = new DriverB("Name2", false, 5);
        drivers.add(driver2);
        transports.add(new Car<>(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                driver2,
                null));
        DriverB driver3 = new DriverB("Name3", true, 3);
        drivers.add(driver3);
        transports.add(new Car<>(
                "BMW",
                "Z8",
                3.0,
                driver3,
                null));
        DriverB driver4 = new DriverB("Name4", true, 7);
        drivers.add(driver4);
        transports.add(new Car<>("Hyundai",
                "Avante",
                1.6,
                driver4,
                null));

        DriverD driver5 = new DriverD("Name5", true, 6);
        drivers.add(driver5);
        transports.add(new Bus<>("Ikarus",
                "250",
                2.5,
                driver5,
                Capacity.XL));
        DriverD driver6 = new DriverD("Name6", true, 13);
        drivers.add(driver6);
        transports.add(new Bus<>("ПАЗ",
                "3205",
                2.9,
                driver6,
                Capacity.S));
        DriverD driver7 = new DriverD("Name7", false, 3);
        drivers.add(driver7);
        transports.add(new Bus<>("ГАЗель",
                "NEXT",
                2.4,
                driver7,
                Capacity.M));
        DriverD driver8 = new DriverD("Name8", true, 4);
        drivers.add(driver8);
        transports.add(new Bus<>("Mercedes",
                "Sprinter",
                3.2,
                driver8,
                Capacity.XS));

        DriverC driver9 = new DriverC("Name9", true, 14);
        drivers.add(driver9);
        transports.add(new Truck<>("Volvo",
                "FH",
                5.4,
                driver9,
                null));
        DriverC driver10 = new DriverC("Name10", true, 5);
        drivers.add(driver10);
        transports.add(new Truck<>("Volvo",
                "VN",
                5.9,
                driver10,
                LoadCapacity.N1));
        DriverC driver11 = new DriverC("Name11", true, 7);
        drivers.add(driver11);
        transports.add(new Truck<>("Volvo",
                "FL6",
                7.2,
                driver11,
                LoadCapacity.N2));
        DriverC driver12 = new DriverC("Name12", false, 2);
        drivers.add(driver12);
        transports.add(new Truck<>("Volvo",
                "VT",
                6.1,
                driver12,
                LoadCapacity.N3));

        Mechanic mechanic1 = new Mechanic("Name13",
                "Company1",
                false, false, false);
        mechanics.add(mechanic1);
        Mechanic mechanic2 = new Mechanic("Name14",
                "Company1",
                true, true, true);
        mechanics.add(mechanic2);
        Mechanic mechanic3 = new Mechanic("Name15",
                "Company1",
                true, false, false);
        mechanics.add(mechanic3);

        for (Transport transport : transports) {
            for (Mechanic mechanic : mechanics) {
                transport.addMechanic(mechanic);
            }
            Utils.printCompeting(transport);
        }
    }
}
