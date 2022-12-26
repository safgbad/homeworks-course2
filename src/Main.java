import stuff.Mechanic;
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
        transports.add(new Car<>(
                "Lada",
                "Granta",
                1.7,
                new DriverB("Name1", true, 2),
                null));
        transports.add(new Car<>(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                new DriverB("Name2", false, 5),
                null));
        transports.add(new Car<>(
                "BMW",
                "Z8",
                3.0,
                new DriverB("Name3", true, 3),
                null));
        transports.add(new Car<>("Hyundai",
                "Avante",
                1.6,
                new DriverB("Name4", true, 7),
                null));

        transports.add(new Bus<>("Ikarus",
                "250",
                2.5,
                new DriverD("Name5", true, 6),
                Capacity.XL));
        transports.add(new Bus<>("ПАЗ",
                "3205",
                2.9,
                new DriverD("Name6", true, 13),
                Capacity.S));
        transports.add(new Bus<>("ГАЗель",
                "NEXT",
                2.4,
                new DriverD("Name7", false, 3),
                Capacity.M));
        transports.add(new Bus<>("Mercedes",
                "Sprinter",
                3.2,
                new DriverD("Name8", true, 4),
                Capacity.XS));

        transports.add(new Truck<>("Volvo",
                "FH",
                5.4,
                new DriverC("Name9", true, 14),
                null));
        transports.add(new Truck<>("Volvo",
                "VN",
                5.9,
                new DriverC("Name10", true, 5),
                LoadCapacity.N1));
        transports.add(new Truck<>("Volvo",
                "FL6",
                7.2,
                new DriverC("Name11", true, 7),
                LoadCapacity.N2));
        transports.add(new Truck<>("Volvo",
                "VT",
                6.1,
                new DriverC("Name12", false, 2),
                LoadCapacity.N3));

        Mechanic mechanic1 = new Mechanic("Name13",
                "Company1",
                false, false, false);
        Mechanic mechanic2 = new Mechanic("Name14",
                "Company1",
                true, true, true);
        Mechanic mechanic3 = new Mechanic("Name15",
                "Company1",
                true, false, false);

        for (Transport transport : transports) {
            transport.addMechanic(mechanic1);
            transport.addMechanic(mechanic2);
            transport.addMechanic(mechanic3);
            Utils.printCompeting(transport);
        }
    }
}
