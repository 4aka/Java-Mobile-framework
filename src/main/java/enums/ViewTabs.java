package enums;

public enum ViewTabs {

    TEXT_CLOCK("TextClock"),
    TABS("Tabs"),
    RADIO_GROUP("Radio Group");

    private final String tab;

    ViewTabs(String tab) {
        this.tab = tab;
    }

    public String getTab() {
        return tab;
    }
}
