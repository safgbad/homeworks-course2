package transport.enums;

public enum Body {
    SEDAN("Седан"),
    HATCHBACK("Хэтчбэк"),
    COUPE("Купе"),
    STATION_WAGON("Универсал"),
    SUV("Внедорожник"),
    CUV("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String body;

    Body(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + body;
    }
}