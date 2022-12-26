public class Main {
    public static void main(String[] args) {
        // Создаем объекты указанные в задании
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия");
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия");
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия");
        Car kia = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4, "красный",
                2018,
                "Южная Корея");
        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея");

        // Выводим в консоль ранее созданные объекты. Здесь неявно вызывается метод toString() класса Car.
        // То есть запись System.out.println(lada) эквивалентна записи System.out.println(lada.toString())
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
    }
}
