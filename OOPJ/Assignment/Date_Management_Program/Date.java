public class Date {

    private int day;
    private int month;
    private int year;

    private int[] noofDays = {
        0, 31, 28, 31, 30, 31,
        30, 31, 31, 30, 31, 30, 31
    };

    public Date(int dd, int mm, int yy) {
        setDate(dd, mm, yy);
    }

    public void setDate(int dd, int mm, int yy) {

        // Validate Year
        if (yy < 1950 || yy > 3000)
            year = 2026;
        else
            year = yy;

        // Validate Month
        if (mm < 1 || mm > 12)
            month = 1;
        else
            month = mm;

        // Validate Day
        if (dd < 1 || dd > daysInMonth(month, year))
            day = 1;
        else
            day = dd;
    }

    // Find number of days in a month
    private int daysInMonth(int month, int year) {

        // February
        if (month == 2) {

            // Leap year
            if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {

                return 29;

            } else {

                return 28;
            }
        }

        // 30 days in months
        if (month == 4 || month == 6 ||
            month == 9 || month == 11) {

            return 30;
        }

        // 31 days in months
        return 31;
    }

    // Add_Days
    public void addDays(int days) {

        while (days > 0) {

            int remainingDays =
                daysInMonth(month, year) - day;

            if (days <= remainingDays) {

                day = day + days;
                days = 0;

            } else {

                days = days - (remainingDays + 1);
                day = 1;

                if (month == 12) {

                    month = 1;
                    year++;

                } else {

                    month++;
                }
            }
        }
    }

    // Add Months
    public void addMonths(int months) {

        while (months > 0) {

            // Add all remaining days of current month
            int remainingDays =
                daysInMonth(month, year) - day;

            addDays(remainingDays + 1);

            months--;
        }
    }

    // Add Years
    public void addYears(int years) {

        while (years > 0) {

            // Calculate number of days in current year
            int daysInYear;

            if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {

                daysInYear= 366;

            } else {

                daysInYear = 365;
            }

            addDays(daysInYear);

            years--;
        }
    }

    // Display Date
    public void display() {

        System.out.println(
            day + "/" + month + "/" + year
        );
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}