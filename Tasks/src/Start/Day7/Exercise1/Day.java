package Start.Day7.Exercise1;

public enum Day implements Weekend, WorkingDay {
    MONDAY("MON", false),
    TUESDAY("TUE", false),
    WEDNESDAY("WED", false),
    THURSDAY("THU", false),
    FRIDAY("FRI", false),
    SATURDAY("SAT", true),
    SUNDAY("SUN", true);

    private final String shortName;
    private final boolean isWeekend;

    Day(String shortName, boolean isWeekend) {
        this.shortName = shortName;
        this.isWeekend = isWeekend;
    }


    @Override
    public boolean isWeekend() {
        return isWeekend;
    }

    @Override
    public boolean isWorkingDay() {
        return !isWeekend;
    }

    public String getShortName() {
        return shortName;
    }

}
