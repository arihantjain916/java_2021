// import java.util.Calendar;
// import java.util.TimeZone;
// import java.util.GregorianCalendar;

import java.util.*;

public class calander {
    public static void main(String[] args) {
        // System.out.println("Milli second passed since 1990 is " + System.currentTimeMillis());
        // System.out.println("Second passed since 1990 is " + System.currentTimeMillis()/1000);
        // System.out.println("Hours passed since 1990 is " + System.currentTimeMillis()/1000/3600);
        // System.out.println("Days passed since 1990 is " + System.currentTimeMillis()/1000/3600/24);
        // System.out.println("Years passed since 1990 is " + System.currentTimeMillis()/1000/3600/24/365);

        // See current date by making object
        // Date d = new Date();
        // System.out.println(d);
        // System.out.println(d.getTime());
        // System.out.println("Date is " + d.getDate());
        // System.out.println("Hours is " + d.getHours());
        // System.out.println("Minutes is " + d.getMinutes());
        // System.out.println("Second is " + d.getSeconds());
        // System.out.println("Year is " + d.getYear());

        // --->All the methords are depreciated means it is not in use.

        // Using calander class to get time and date

        // to get time of current time zone 
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTimeZone().getID());
        // System.out.println(c.getTime());

        // to get time of given time zone
        // Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(c.getTimeZone().getID());
        // System.out.println(c.getTime());

        // gregorian calander
        // Calendar c = Calendar.getInstance();
        // System.out.println(c.get(Calendar.DATE));
        // System.out.println("Current time in 12hrs format is " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR));
        // System.out.println(c.get(Calendar.MINUTE));
        // System.out.println(c.get(Calendar.SECOND));
        // to get time in 24hrs format then we have to use
        // System.out.println("Current time in 12hrs format is " + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        // System.out.println(c.get(Calendar.HOUR_OF_DAY));

        // System.out.println(c.get(Calendar.DAY_OF_WEEK)); //it give the number of the day

        // make the instance of greogorian calander
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024)); // it give true if given year is leap year and false if not. 
        
    }
}