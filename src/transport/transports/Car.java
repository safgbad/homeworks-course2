package transport.transports;

import stuff.Mechanic;
import stuff.driver.drivers.DriverB;
import transport.Transport;
import transport.enums.Body;

import java.util.Objects;

public class Car<T extends DriverB> extends Transport {
    private Body body;

    public Car(String brand,
               String model,
               double engineVolume,
               T driver,
               Body body) {
        super(brand, model, engineVolume, driver);
        setBody(body);
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = Objects.requireNonNullElse(body, Body.SEDAN);
    }

    @Override
    public void addMechanic(Mechanic mechanic) {
        if (mechanic != null
                && mechanic.isWorkingWithCars()) {
            mechanics.add(mechanic);
        }
    }

    @Override
    public void printType() {
        System.out.println('[' + brand + ' ' + model + "] " + body);
    }

    @Override
    public int getDiagnostic() {
        if (driver.isHaveLicense()) {
            return 1;
        }
        return 0;
    }
}
