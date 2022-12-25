package transport.transports;

import transport.Transport;
import utils.Utils;

import java.time.LocalDate;
import java.util.Objects;

public class Car extends Transport {

    private double engineVolume;


    private String transmission;
    private final String typeOfBody;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean areTiresWinter;
    private Key key;
    private Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmission,
               String typeOfBody,
               String registrationNumber,
               int numberOfSeats,
               boolean areTiresWinter,
               Key key,
               Insurance insurance,
               double maxSpeed) {
        super(brand, model, color, year, country, maxSpeed);

        setEngineVolume(engineVolume);

        setTransmission(transmission);

        if (Utils.isStringNotNullAndNotBlank(typeOfBody)) {
            this.typeOfBody = typeOfBody;
        } else {
            this.typeOfBody = "default";
        }

        setRegistrationNumber(registrationNumber);

        if (numberOfSeats > 0) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 5;
        }

        this.areTiresWinter = areTiresWinter;

        setKey(key);

        setInsurance(insurance);
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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isAreTiresWinter() {
        return areTiresWinter;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public void setTransmission(String transmission) {
        if (Utils.isStringNotNullAndNotBlank(transmission)) {
            this.transmission = transmission;
        } else {
            this.transmission = "default";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (Utils.isStringNotNullAndNotBlank(registrationNumber) && registrationNumber.length() == 9) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "default";
        }
    }

    public void setAreTiresWinter(boolean areTiresWinter) {
        this.areTiresWinter = areTiresWinter;
    }

    public void setKey(Key key) {
        this.key = Objects.requireNonNullElse(key, Key.DEFAULT_KEY);
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
        if (insurance != null && insurance.getValidity() == null) {
            System.out.println("Необходимо оформить новую страховку для " + brand + ' ' + model + '!');
        }
        if (insurance != null && insurance.getNumber() == null) {
            System.out.println("Номер страховки " + brand + ' ' + model + " некорректный!");
        }
    }

    public void changeTires(int monthNumber) {
        switch (monthNumber) {
            case 11:
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
                areTiresWinter = true;
                break;
            default:
                areTiresWinter = false;
        }
    }

    @Override
    public String toString() {
        return "========================================\n" +
                "[Легковой автомобиль] " + brand + " " + model + '\n'
                + "Мощность двигателя: " + engineVolume + '\n'
                + "Цвет кузова: " + color + '\n'
                + "Год производства: " + year + '\n'
                + "Страна сборки: " + color + '\n'
                + "Коробка передач: " + transmission + '\n'
                + "Тип кузова: " + typeOfBody + '\n'
                + "Регистрационный номер: " + registrationNumber + '\n'
                + "Количество мест: " + numberOfSeats + '\n'
                + "Зимняя резина: " + (areTiresWinter ? "да" : "нет") + '\n'
                + "Ключ: " + key + '\n'
                + "Страховка: " + (insurance != null ? insurance : "нет") + '\n'
                + "Максимальная скорость (км/ч): " + maxSpeed + '\n'
                + "========================================";
    }

    public static class Key {
        public static final Key DEFAULT_KEY = new Key(false, false);

        private final Boolean remoteEngineStart;
        private final Boolean keylessAccess;

        public Key(Boolean remoteEngineStart, Boolean keylessAccess) {
            this.remoteEngineStart = Objects.requireNonNullElse(remoteEngineStart, false);
            this.keylessAccess = Objects.requireNonNullElse(keylessAccess, false);
        }

        public Boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public Boolean getKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "[Удаленный запуск двигателя: " + (remoteEngineStart ? "да" : "нет")
                    + "; Бесключевой доступ: " + (keylessAccess ? "да" : "нет") + ']';
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final double price;
        private final String number;

        public Insurance(LocalDate validity, double price, String number) {
            if (validity != null && validity.isAfter(LocalDate.now())) {
                this.validity = validity;
            } else {
                this.validity = null;
            }

            if (price > 0) {
                this.price = price;
            } else {
                this.price = 0;
            }

            if (Utils.isStringNotNullAndNotBlank(number) && number.length() == 9) {
                this.number = number;
            } else {
                this.number = null;
            }
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "[Срок действия: " + (validity != null ? validity.toString() : "invalid")
                    + "; Стоимость: " + price
                    + "; Номер: " + (number != null ? number : "invalid") + ']';
        }
    }
}
