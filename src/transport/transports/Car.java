package transport.transports;

import driver.drivers.DriverB;
import transport.Transport;

public class Car <T extends DriverB> extends Transport {
    public Car(String brand,
               String model,
               double engineVolume,
               T driver) {
        super(brand, model, engineVolume, driver);
    }
}
