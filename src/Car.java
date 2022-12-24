public class Car {
    // Перечисляем поля (свойства), которыми должен обладать каждый автомобиль
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    // Пишем конструктор, принимающий все необходимые для создания объекта Car свойства
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country) {
        // Каждое пришедшее в конструктор свойство проверяем соответственно заданию.
        // Если пришедшее значение нас не устраивает, то присваиваем полю нашего объекта стандартное значение соответственно заданию.

        // Метод isStringNotNullAndNotBlank располагается в классе Utils
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

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (Utils.isStringNotNullAndNotBlank(color)) {
            this.color = color;
        } else {
            this.color = "белый";
        }

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
    }

    // Метод toString(), позволяющий получить строковое представление объекта в нужном на формате.
    @Override
    public String toString() {
        return "========================================\n" +
                brand + " " + model + '\n'
                + "Мощность двигателя: " + engineVolume + '\n'
                + "Цвет кузова: " + color + '\n'
                + "Год производства: " + year + '\n'
                + "Страна сборки: " + color + '\n'
                + "========================================";
    }
}
