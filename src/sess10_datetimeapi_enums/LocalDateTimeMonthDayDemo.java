package sess10_datetimeapi_enums;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.MonthDay;
import util.Spacer;
//import java.time.Month;

/**
 * java program to demonstrate the use of the localDate, localTime,
 * LocalDateTime and monthDay classes from the java. time package.
 * 
 * 1. LocalDate rep a date (year, month, day) without a time zone.
 * 2.LocalTime rep time (hours, minutes, seconds) without a date or
 * timezone
 * 3. LocalDateTime rep both a date and time without timezone.
 * 4. MonthDay rep a specific month and day without a year(useful for
 * recurring events like payroll pay dates)
 * 
 * @author pc
 */
public class LocalDateTimeMonthDayDemo
{
    //===================================
    //1. Demonstrate the LocalDate class
    //====================================
    private static void demoLocalDate()
    {
        System.out.println("1. LocalDate: Handling a date (year, month,day)" 
                + "without a time zone.");
        
        //Get the current date 
        LocalDate today = LocalDate.now();
        System.out.println("Toda's date is: " + today);
        
        //Create a specific LocalDate (e.g, Christmas 2025)
        LocalDate Christmas = LocalDate.of(2025, 12, 25);
        System.out.println("Christmas 2025 will be on: " + Christmas);
        
        //Adding and subtracting days, months, and years
        LocalDate oneWeekLater = today.plusWeeks(1);
        System.out.println("One week after will be: " + oneWeekLater);
        
        LocalDate oneMonthEarlier = today.minusMonths(1);
        System.out.println("One month before today was: " + oneMonthEarlier);
        
        //Checking if the current year is leap or not
        boolean isLeapYear = today.isLeapYear();
        System.out.println( today.getYear() + "is a leap year? " + isLeapYear);
        
        //Get the day of the week
        System.out.println("Day of the week is: " + today.getDayOfWeek());
    
    }
    
    //===================================
    //2. Demonstrate the LocalTime class
    //====================================
    private static void demoLocalTime()
    {
        System.out.println("2. LocalTime: Handling a time " 
                + "(hours, minutes, seconds) without a date \n"
                        + " or timezone.");
        
        //Get the current time from the system the program is runnig on
        LocalTime now = LocalTime.now();
        System.out.println("The current system time is: " + now);
        
        //Create aspecific LocalTime (eg. 15:30)
        LocalTime afternoonTime = LocalTime.of(15, 30, 8);
        System.out.println("Last class of the day will end at: " + afternoonTime);
        
        //Add/subtract time
        LocalTime twoHoursLater = now.plusMinutes(2);
        System.out.println("The time 2 hours from now will be: " + twoHoursLater);
        
        LocalTime thirty5MinEarlier = now.minusMinutes(35);
        System.out.println("The time35 minute ago was: " + thirty5MinEarlier);
        
        //Display current hour, minute and second
        System.out.printf("Current hour: %d"
        + "\nCurrent minute: %d"
        + "\nCurrent secod: %d\n",now.getHour(),now.getMinute(),now.getSecond());
    }
    
    //===================================
    //3. Demonstrate the LocalDateTime class
    //====================================
    private static void demoLocalDateTime()
    {
        System.out.println("3. LocalDateTime: both a date and time-without"
            + "time zone. ");
            
            //Get the current date and time from the system running the progrm
            LocalDateTime now = LocalDateTime.now();
            System.out.println("The current date and time is: " + now);
            
            //Create a specific LocalDateTime
            LocalDateTime examDateTime = LocalDateTime.of(2026,1,15,9,00);
             System.out.println("Our Java fundamentals exam will be on: " +examDateTime);
             
            //Adding/subtracting time from a given datetime
            LocalDateTime threeDaysLater = now.plusDays(3);
            System.out.println("The date & time 3 days from now will be:" + threeDaysLater);
    }
    
    //======================================
    //4. Demonstrate the LocalDateTime class
    //======================================
    private static void demoMonthDay()
    {
        System.out.println("4. MonthDay: represents a specific month and day" + "without a year. ");
        
        //Get current month and day
        MonthDay currentMonthDay = MonthDay.now();
        System.out.println("Today's month & day are: ");
        
        //Create a specific MonthDay(e.g Bithday's Day)
        MonthDay BirthDay = MonthDay.of(3, 06); //March, 6th
        System.out.println("Birthday's day will be on: " + BirthDay);
        
        //Check if todays date matches Birthday's day
        boolean isBirthDay = currentMonthDay.equals(BirthDay);
        System.out.println("is today BirthDay? " + isBirthDay);
        
        //Chick if todays date is before  birthday
        boolean isBeforeBirthDay = currentMonthDay.equals(BirthDay);
        System.out.println("is today before BirthDay? " + isBeforeBirthDay);
    }
    
    

    //Main program begin execution
    public static void main(String[] args)
    {
        // 1. Demonstrate the LocalDate class
        demoLocalDate();
        Spacer.separator();
        
        // 2. Demonstrate the LocalTime class
        demoLocalTime();
        Spacer.separator();
        
        // 3. Demonstrate the LocalDateTime class
        demoLocalDateTime();
        Spacer.separator();
        
        // 4. Demonstrate the MonthDay class
        demoMonthDay();
        Spacer.separator();
    
    }
    
}
