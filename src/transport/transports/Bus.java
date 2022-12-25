package transport.transports;

import transport.Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, String color, int year, String country, double maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);
    }

    @Override
    public String toString() {
        return "========================================\n" +
                "[Автобус] " + brand + " " + model + '\n'
                + "Цвет кузова: " + color + '\n'
                + "Год производства: " + year + '\n'
                + "Страна сборки: " + color + '\n'
                + "Максимальная скорость (км/ч): " + maxSpeed + '\n'
                + "========================================";
    }
}
