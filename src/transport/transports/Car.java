package transport.transports;

import driver.drivers.DriverB;
import transport.Transport;
import transport.enums.Body;

import java.util.Objects;

public class Car <T extends DriverB> extends Transport {
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
    public void printType() {
        System.out.println('[' + brand + ' ' + model + "] " + body);
    }
}
