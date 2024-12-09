package enums;

public enum SingleChoiceList {

    MAP("Map"),
    SATELLITE("Satellite"),
    TRAFFIC("Traffic"),
    STREET_VIEW("Street view");

    private final String element;

    SingleChoiceList(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
