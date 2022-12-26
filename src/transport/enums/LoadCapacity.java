package transport.enums;

public enum LoadCapacity {
    N1(null, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);

    private final Double lowerLimit;
    private final Double upperLimit;

    LoadCapacity(Double lowerLimit, Double upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Грузоподъемность:");
        if (lowerLimit != null) {
            stringBuilder.append(" от ").append(lowerLimit).append(" тонн");
        }
        if (upperLimit != null) {
            stringBuilder.append(" до ").append(upperLimit).append(" тонн");
        }
        return stringBuilder.toString();
    }
}