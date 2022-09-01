package HomeWork;

public enum DaysOfTheWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;


    public static void daysOfTheWeek(DaysOfTheWeek day) {
        switch (day){
        case SUNDAY, TUESDAY,THURSDAY -> System.out.println(day+" куну техникалык сабак жана английский бегиннерлерге");
        case MONDAY,WEDNESDAY -> System.out.println(day+" куну практикалык сабак жана английский толкин клаб ");
        case FRIDAY,SATURDAY -> System.out.println(day+" куну бизге сабак болбойт");
        default -> System.out.println("ERROR");

    }
    }
}
