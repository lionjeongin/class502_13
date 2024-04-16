package exam02;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public void setYear(int _year){
        year = _year;
    }

    public void setMonth(int _month) {
        month = _month;
    }

    public void setDay(int _day) {
        if (month == 2 && _day > 28) {
            _day = 28;
        }

        day = _day;
    }

    void showDate() {
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, day);
    }
}