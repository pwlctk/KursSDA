package main.java.pl.pwlctk.kurs04.zajecia.Time;

public class Time {
    private int hours;
    private int minutes;

    public Time(int hour, int minute) {
        this.hours = hour;
        this.minutes = minute;
    }

    public Time(String time) {
        String[] hoursMinutes = time.split(":");
        this.hours = Integer.parseInt(hoursMinutes[0]);
        this.minutes = Integer.parseInt(hoursMinutes[1]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private String formatDigit(int digit) {
        if (Math.abs(digit) < 10) {
            return "0" + digit;
        } else {
            return digit + "";
        }
    }

    private String formatTime(int hours, int minutes) {
        if (Math.abs(hours) < 10) {
            if (hours < 0 || (minutes < 0 && hours == 0)) {
                return "-0" + Math.abs(hours) + ":" + formatDigit(Math.abs(minutes));
            } else {
                return "0" + hours + ":" + formatDigit(Math.abs(minutes));
            }
        } else {
            return hours + ":" + formatDigit(Math.abs(minutes));
        }
    }

    private void fixMinutes() {
        if (minutes > 59) {
            hours += minutes / 60;
        } else if (minutes < -59) {
            hours -= minutes / 60;
        }
        minutes %= 60;
    }

    public Time add(Time time) {
        int h = hours;
        int m = minutes;
        h += time.getHours();
        m += time.getMinutes();
        if (m > 59) {
            h += m / 60;
            m %= 60;
        }
        return new Time(h, m);
    }

    public Time substract(Time time) {
        int h = hours;
        int m = minutes;
        h -= time.getHours();
        m -= time.getMinutes();
        if (m < -59) {
            h -= m / 60;
        }
        return new Time(h, m);
    }

    public void multiply(int multipler) {
        hours *= multipler;
        if (hours >= 0) {
            minutes *= multipler;
        } else {
            minutes *= multipler * -1;
        }
        fixMinutes();
    }

    public String toString() {
        return formatTime(hours, minutes);
    }
}
