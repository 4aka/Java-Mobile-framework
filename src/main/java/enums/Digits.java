package enums;

public enum Digits {

    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4");

    private final String digit;

    Digits(String digit) {
        this.digit = digit;
    }

    public String getDig() {
        return digit;
    }
}
