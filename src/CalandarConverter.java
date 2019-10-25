public class CalandarConverter {
    public static final int Monday = 1;
    public static final int Tuesday = 2;
    public static final int Wednesday = 3;
    public static final int Thursday = 4;
    public static final int Friday = 5;
    public static final int Saturday = 6;
    public static final int Sunday = 7;

    public static String convertDayToString(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "unidentified";
        }
        return dayName;
    }

}



