package transport.transports;

import driver.drivers.DriverD;
import transport.Transport;
import transport.enums.Capacity;

import java.util.Objects;

public class Bus <T extends DriverD> extends Transport {
    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               T driver,
               Capacity capacity) {
        super(brand, model, engineVolume, driver);
        setCapacity(capacity);
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = Objects.requireNonNullElse(capacity, Capacity.S);
    }

    @Override
    public void printType() {
        System.out.println('[' + brand + ' ' + model + "] " + capacity);
    }
}
