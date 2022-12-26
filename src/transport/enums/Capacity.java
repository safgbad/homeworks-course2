package transport.enums;

public enum Capacity {
    XS(null, 10),
    S(null, 25),
    M(40, 50),
    L(60, 80),
    XL(100, 120);

    private final Integer lowerLimit;
    private final Integer upperLimit;

    Capacity(Integer lowerLimit, Integer upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Вместимость:");
        if (lowerLimit != null) {
            stringBuilder.append(" от ").append(lowerLimit);
        }
        if (upperLimit != null) {
            stringBuilder.append(" до ").append(upperLimit);
        }
        stringBuilder.append(" человек");
        return stringBuilder.toString();
    }
}
