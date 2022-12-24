public class Utils {
    // Метод isStringNotNullAndNotBlank(String str) проверяет не является ли строка str null и не пустая ли она.
    public static boolean isStringNotNullAndNotBlank(String str) {
        return str != null && !str.isBlank();
    }
}
