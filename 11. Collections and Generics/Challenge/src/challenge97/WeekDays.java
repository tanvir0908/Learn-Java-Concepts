package challenge97;

public enum WeekDays {
    Saturday(true),
    Sunday(true),
    Monday(false),
    Tuesday(false),
    Wednesday(false),
    Thursday(false),
    Friday(false);

    private final boolean isWeekend;

    WeekDays(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public String getType() {
        return isWeekend ? "Weekend" : "Weekday";
    }
}
