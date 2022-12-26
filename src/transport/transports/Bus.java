package transport.transports;

import driver.drivers.DriverD;
import transport.Transport;

public class Bus <T extends DriverD> extends Transport {
    public Bus(String brand,
               String model,
               double engineVolume,
               T driver) {
        super(brand, model, engineVolume, driver);
    }
}
