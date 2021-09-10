package Start.Day7.Exercise2;

import Start.Day7.Exercise1.Day;

import java.util.Arrays;

public enum Dances {
    HIPHOP(new String[]{"12;30", "14;00"}, new Day[]{Day.MONDAY, Day.THURSDAY}) {
        @Override
        public Dances getAlternative() {
            return JAZZ;
        }
    },
    JAZZ(new String[]{"14;00", "16.00"}, new Day[]{Day.TUESDAY, Day.WEDNESDAY}) {
        @Override
        public Dances getAlternative() {
            return HIPHOP;
        }
    },
    BALLET(new String[]{"11;00", "13;00"}, new Day[]{Day.FRIDAY, Day.SATURDAY}) {
        @Override
        public Dances getAlternative() {
            return JAZZ;
        }
    };


    private final String[] hours;
    private final Day[] days;


    Dances (String[] hours, Day[] days) {
        this.hours = hours;
        this.days = days;
    }

    public abstract Dances getAlternative();

    public String[] getHours() {
        return hours;
    }

    public Day[] getDays() {
        return days;
    }

}
