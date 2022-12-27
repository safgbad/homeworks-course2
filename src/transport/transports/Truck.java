package transport.transports;

import driver.drivers.DriverC;
import transport.Transport;
import transport.enums.LoadCapacity;

import java.util.Objects;

public class Truck <T extends DriverC> extends Transport {
    private LoadCapacity loadCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 T driver,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        setLoadCapacity(loadCapacity);
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = Objects.requireNonNullElse(loadCapacity, LoadCapacity.N1);
    }

    @Override
    public void printType() {
        System.out.println('[' + brand + ' ' + model + "] " + loadCapacity);
    }
}
