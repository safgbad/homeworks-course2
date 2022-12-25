import transport.transports.Bus;
import transport.transports.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "Механическая",
                "Седан",
                "В235АВ116",
                5,
                false,
                null,
                null,
                120);
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия",
                "Автомат",
                "Седан",
                "Л352ИО178",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusYears(1), 100500, "418482390"),
                240);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                "Автомат",
                "Седан",
                "Е361ПТ198",
                5,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(5), 141232, "183271270"),
                270);
        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4, "красный",
                2018,
                "Южная Корея",
                "Механическая",
                "Кроссовер",
                "А231ОУ101",
                7,
                true,
                new Car.Key(true, false),
                new Car.Insurance(LocalDate.now().minusDays(1), 75396, "472642011"),
                170);
        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "Автомат",
                "Кроссовер",
                "П361ЛЦ777",
                5,
                true,
                new Car.Key(false, false),
                new Car.Insurance(LocalDate.now().plusDays(10), 53291, "141"),
                190);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Bus ikarus = new Bus("Ikarus",
                "250",
                "желтый",
                1973,
                "Венгрия",
                120);
        Bus pazik = new Bus("ПАЗ",
                "3205",
                null,
                1995,
                "Россия",
                90);
        Bus gazel = new Bus("ГАЗель",
                "NEXT",
                "красный",
                2019,
                null,
                95.0);

        System.out.println(ikarus);
        System.out.println(pazik);
        System.out.println(gazel);
    }
}
