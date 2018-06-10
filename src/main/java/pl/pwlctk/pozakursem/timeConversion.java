package main.java.pl.pwlctk.pozakursem;


public class timeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    static String timeConversion(String s) {
        String[] time = s.split(":");
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0, 2);
        String dayEve = time[2].substring(2, 4);
        String format24;
        if (dayEve.equals("AM")) {
            format24 = (hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds;
        } else {
            format24 = (hours.equals("12") ? hours : (Integer.parseInt(hours) + 12)) + ":" + minutes + ":" + seconds;
        }
        return format24;
    }
}

