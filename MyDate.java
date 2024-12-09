import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month; // (0 = Jan, 11 = Dec)
    private int day;

    // no-arg constructor for current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // constructor 2: Use elapsed time to calculate the date
    public MyDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime); // set calendar to the elapsed time
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // constructor 3: Create a date with specific year, month, day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getters for year, month, day
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    // method to set date using elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime); // Update the calendar with new time
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // test Program (main method)
    public static void main(String[] args) {
        // display the current date
        MyDate today = new MyDate(); // MyDate object for current date
        System.out.println("Today's Date:");
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + (today.getMonth() + 1)); // add 1 to display months 1-12 that match what people expect
        System.out.println("Day: " + today.getDay());

        // display a date from elapsed time
        long elapsedTime = 34355555133101L;
        MyDate futureDate = new MyDate(elapsedTime); // MyDate object with elapsed time
        System.out.println("Date from elapsed time (" + elapsedTime + " milliseconds):");
        System.out.println("Year: " + futureDate.getYear());
        System.out.println("Month: " + (futureDate.getMonth() + 1));
        System.out.println("Day: " + futureDate.getDay());

        // update an existing date using setDate()
        long newElapsedTime = 561555550000L;
        today.setDate(newElapsedTime); // update the current date
        System.out.println("Date using elapsed time (" + newElapsedTime + " milliseconds):");
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + (today.getMonth() + 1));
        System.out.println("Day: " + today.getDay());
    }
}
