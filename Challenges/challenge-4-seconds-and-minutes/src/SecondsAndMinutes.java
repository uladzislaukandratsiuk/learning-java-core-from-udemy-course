public class SecondsAndMinutes {

    private static final String INVALID_VALUE = "Invalid value";

    public static void main(String[] args) {

        System.out.println("Good parameters:");
        System.out.println(getDurationString(61L, 1L));
        System.out.println(getDurationString(161L, 24L));
        System.out.println(getDurationString(212352L));
        System.out.println("Bad parameters:");
        System.out.println(getDurationString(61L, -12L));
        System.out.println(getDurationString(61L, 120L));
        System.out.println(getDurationString(-352L));
    }

    private static String getDurationString(long minutes, long seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE;
        }

        long hours = (minutes / 60) + (seconds / 3600);
        minutes %= 60;

        return getDurationStringFormat(hours, minutes, seconds);
    }

    private static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_VALUE;
        }

        long minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }

    private static String getDurationStringFormat(long hours, long minutes, long seconds) {

        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m ";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }
}
