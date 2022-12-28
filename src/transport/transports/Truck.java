package transport.transports;

import driver.drivers.DriverC;
import transport.Transport;

public class Truck <T extends DriverC> extends Transport {
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 T driver) {
        super(brand, model, engineVolume, driver);
    }
}
