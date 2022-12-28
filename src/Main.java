import driver.drivers.DriverB;
import driver.drivers.DriverC;
import driver.drivers.DriverD;
import transport.transports.Bus;
import transport.transports.Car;
import transport.transports.Truck;
import utils.Utils;

public class Main {
    public static void main(String[] args) {
        Car<DriverB> lada = new Car<>(
                "Lada",
                "Granta",
                1.7,
                new DriverB("Name1", true, 2));
        Car<DriverB> audi = new Car<>(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                new DriverB("Name2", false, 5));
        Car<DriverB> bmw = new Car<>(
                "BMW",
                "Z8",
                3.0,
                new DriverB("Name3", true, 3));
        Car<DriverB> hyundai = new Car<>("Hyundai",
                "Avante",
                1.6,
                new DriverB("Name4", true, 7));

        Bus<DriverD> ikarus = new Bus<>("Ikarus",
                "250",
                2.5,
                new DriverD("Name5", true, 6));
        Bus<DriverD> pazik = new Bus<>("ПАЗ",
                "3205",
                2.9,
                new DriverD("Name6", true, 13));
        Bus<DriverD> gazel = new Bus<>("ГАЗель",
                "NEXT",
                2.4,
                new DriverD("Name7", false, 3));
        Bus<DriverD> sprinter = new Bus<>("Mercedes",
                "Sprinter",
                3.2,
                new DriverD("Name8", true, 4));

        Truck<DriverC> volvoFH = new Truck<>("Volvo",
                "FH",
                5.4,
                new DriverC("Name9", true, 14));
        Truck<DriverC> volvoVN = new Truck<>("Volvo",
                "VN",
                5.9,
                new DriverC("Name10", true, 5));
        Truck<DriverC> volvoFL6 = new Truck<>("Volvo",
                "FL6",
                7.2,
                new DriverC("Name11", true, 7));
        Truck<DriverC> volvoVT = new Truck<>("Volvo",
                "VT",
                6.1,
                new DriverC("Name12", false, 2));

        Utils.printCompeting(lada);
        Utils.printCompeting(audi);
        Utils.printCompeting(bmw);
        Utils.printCompeting(hyundai);
        Utils.printCompeting(ikarus);
        Utils.printCompeting(pazik);
        Utils.printCompeting(gazel);
        Utils.printCompeting(sprinter);
        Utils.printCompeting(volvoFH);
        Utils.printCompeting(volvoVN);
        Utils.printCompeting(volvoFL6);
        Utils.printCompeting(volvoVT);
    }
}
