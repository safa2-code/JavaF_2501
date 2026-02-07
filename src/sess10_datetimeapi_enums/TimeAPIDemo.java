package sess10_datetimeapi_enums;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import util.Spacer;
/**
 * Java program to demonstrate the use of clock, duration & instant
 * classes from the java.time package
 * 
 * 1. Clock provides access to the current time in a specific time zone.
 * 2. Duration measures the amount of time in a specific time zone.
 * 3. Instant represents a specific moment on the timeline (in UTC)
 * 
 * @author Window
 */
public class TimeAPIDemo
{
    //==========================================
    // 1. Demonstrating the clock class
    //==========================================
    private static void demoClock()
    {
        System.out.println("1. Clock: Getting the current time");
        // Get the sys clock in a default time zone (sys default)
        Clock clock = Clock.systemDefaultZone();
        
        // Get the current time using clock
        Instant now = clock.instant();
        System.out.println("Current instant: " + now);
        
        // Get the current time in a specific time zone (UTC)
        Clock utcClock = Clock.systemUTC();
        Instant utcNow = utcClock.instant();
        System.out.println("Current instant in UTC: " + utcNow);
        
        // Get the current time in a specific time zone (Asia/Tokyo)
        Clock tokyoClock = Clock.system(ZoneId.of("Asia/Tokyo"));
        Instant tokyoNow = tokyoClock.instant();
        System.out.println("Current instant in Tokyo,Japan: " + tokyoNow);
    }
    
    //===============================================
    // 2. Demonstrating the Duration class
    //======================================================
    private static void demoDuration()
    {
        System.out.println("\n2. Duration measuring the time between two instants.");
        
        // Create 2 instants: one for the current moment and the other for the past
        Instant start = Instant.now();
        
        // Simulate some processing for 2.5seconds
        try
        {
            Thread.sleep(2500);// put the thread to sleep for 2.5 sec.
        } catch (InterruptedException ie)
        {
            System.out.println("Thread interrupted.\n" + ie.getLocalizedMessage());
        }
        
        Instant end = Instant.now();
        // calculate the duration between the start and end moments
        Duration duration = Duration.between(start, end);
        System.out.println("Time elapsed: " + duration.toMillis() + "milliseconds. ");
        System.out.println("Time elapsed in seconds: " + duration.getSeconds() + "seconds.");
        
        //Convert the duration to minutes and hours
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        System.out.println("Duration in hours: " + hours + "hours");
        System.out.println("Duration in minutes: " + minutes + "minutes");
    }
    
    //=============================================
    //3. Demonstrating the Instant class
    //=============================================
    private static void demoInstant()
    {
        System.out.println("\n3. Instant: Representing a specific point in time");
 
        // Create an Instant representing the current moment in time
        Instant instantNow = Instant.now();
        System.out.println("Current Instant (in UTC): " + instantNow);
 
        // Convert Instant to a different time zone (e.g., Nairobi)
        System.out.println("Instant as Nairobi: " + instantNow.atZone(ZoneId.of("Africa/Nairobi")));
 
        // Add or subtract time to/from an Instant
        Instant instantInFuture = instantNow.plus(Duration.ofDays(10)); // 10 days later
        System.out.println("Instant 10 days later: " + instantInFuture);
 
        Instant instantInPast = instantNow.minus(Duration.ofHours(5)); // 5 hours earlier
        System.out.println("Instant 5 hours earlier: " + instantInPast);
    }
    
    // main method to begin program execution
    public static void main(String[] args)
    {
        //1. Demonstrate the clock class
        demoClock();
        Spacer.separator();
        
        //2. Demonstrate the Duration class
        demoDuration();
        Spacer.separator();
        
        //3. Demonstrate the Instant class
        demoInstant();
        Spacer.separator();
    }
}