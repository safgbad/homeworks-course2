package transport;

import utils.Utils;

public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected String color;
    protected final int year;
    protected final String country;
    protected double maxSpeed;

    public Transport(String brand, String model, String color, int year, String country, double maxSpeed) {
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

        setColor(color);

        if (year > 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (Utils.isStringNotNullAndNotBlank(country)) {
            this.country = country;
        } else {
            this.country = "default";
        }

        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (Utils.isStringNotNullAndNotBlank(color)) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = 90;
        }
    }
}
