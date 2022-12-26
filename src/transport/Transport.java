package transport;

import stuff.Mechanic;
import stuff.driver.Driver;
import transport.transports.Bus;
import transport.transports.Car;
import transport.transports.Truck;
import utils.Utils;

import java.util.*;

public abstract class Transport implements Competing {
    private final String type;
    protected final String brand;
    protected final String model;
    private double engineVolume;
    protected Driver driver;
    protected final Set<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, Driver driver) {
        if (this instanceof Car) {
            type = "Легковой автомобиль";
        } else if (this instanceof Bus) {
            type = "Автобус";
        } else if (this instanceof Truck) {
            type = "Грузовой автомобиль";
        } else {
            type = "default";
        }

        if (Utils.isStringNotNullAndNotBlank(brand)) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (Utils.isStringNotNullAndNotBlank(model)) {
            this.model = model;
        } else {
            this.model = "default";
        }

        setEngineVolume(engineVolume);

        this.driver = driver;

        mechanics = new HashSet<>();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Driver getDriver() {
        return driver;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public abstract void addMechanic(Mechanic mechanic);

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void startMoving() {
        System.out.println(type + ' ' + brand + " " + model + " начал движение.");
    }

    public void endMoving() {
        System.out.println(type + ' ' + brand + " " + model + " закончил движение.");
    }

    public abstract void printType();

    // -1 – для транспортных средств, не требующих диагностики
    // 0 – для непрошедших диагностику транспортных средств
    // 1 – для прошедших диагностику транспортных средств
    public abstract int getDiagnostic();

    @Override
    public void pitStop() {
        System.out.println(type + ' ' + brand + " " + model + " на пит-стопе.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучший круг " + brand + " " + model + ": " + 5 + 3 * Math.random() + " мин.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + brand + " " + model + ": " + 5 + 3 * Math.random() + " км/ч.");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("========================================\n" +
                "[" + type + "] " + brand + " " + model + '\n'
                + "Мощность двигателя: " + engineVolume + '\n'
                + (driver != null ? "Водитель: " + driver + '\n' : "")
                + (mechanics.isEmpty() ? "" : "Механики:\n"));
        for (Mechanic mechanic : mechanics) {
            stringBuilder.append("\t • ").append(mechanic).append('\n');
        }
        stringBuilder.append("========================================");
        return stringBuilder.toString();
    }
}
