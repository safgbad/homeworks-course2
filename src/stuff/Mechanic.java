package stuff;

import transport.Transport;
import utils.Utils;

import java.util.Objects;

public class Mechanic {
    private final String fullName;
    private String company;
    private boolean workingWithCars;
    private boolean workingWithTrucks;
    private boolean workingWithBuses;

    public Mechanic(String fullName, String company, boolean workingWithCars, boolean workingWithTrucks, boolean workingWithBuses) {
        if (Utils.isStringNotNullAndNotBlank(fullName)) {
            this.fullName = fullName;
        } else {
            this.fullName = "default";
        }

        setCompany(company);

        this.workingWithCars = workingWithCars;
        this.workingWithTrucks = workingWithTrucks;
        this.workingWithBuses = workingWithBuses;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean isWorkingWithCars() {
        return workingWithCars;
    }

    public boolean isWorkingWithTrucks() {
        return workingWithTrucks;
    }

    public boolean isWorkingWithBuses() {
        return workingWithBuses;
    }

    public void setCompany(String company) {
        if (Utils.isStringNotNullAndNotBlank(company)) {
            this.company = company;
        } else {
            this.company = "default";
        }
    }

    public void setWorkingWithCars(boolean workingWithCars) {
        this.workingWithCars = workingWithCars;
    }

    public void setWorkingWithTrucks(boolean workingWithTrucks) {
        this.workingWithTrucks = workingWithTrucks;
    }

    public void setWorkingWithBuses(boolean workingWithBuses) {
        this.workingWithBuses = workingWithBuses;
    }

    public void serviceTransport(Transport transport) {
        if (transport.getMechanics().contains(this)) {
            System.out.println("Механик " + fullName + " провел техобслуживание "
                    + transport.getModel() + ' ' + transport.getBrand());
        } else {
            System.out.println("Механик " + fullName + " не может работать с "
                    + transport.getModel() + ' ' + transport.getBrand());
        }
    }

    public void fixTransport(Transport transport) {
        if (transport.getMechanics().contains(this)) {
            System.out.println("Механик " + fullName + " починил "
                    + transport.getModel() + ' ' + transport.getBrand());
        } else {
            System.out.println("Механик " + fullName + " не может работать с "
                    + transport.getModel() + ' ' + transport.getBrand());
        }
    }

    @Override
    public String toString() {
        return "Механик " + fullName + " (" + company +
                "); работает с легковыми автомобилями" + (workingWithCars ? "(да)" : "(нет)")
                + ", грузовиками" + (workingWithTrucks ? "(да)" : "(нет)")
                + ", автобусами" + (workingWithBuses ? "(да)" : "(нет)");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return workingWithCars == mechanic.workingWithCars
                && workingWithTrucks == mechanic.workingWithTrucks
                && workingWithBuses == mechanic.workingWithBuses
                && fullName.equals(mechanic.fullName)
                && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company, workingWithCars, workingWithTrucks, workingWithBuses);
    }
}
