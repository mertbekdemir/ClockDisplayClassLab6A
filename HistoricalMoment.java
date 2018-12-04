
/**
 * This class describes a historical moment 
 *
 * @author Mert Bekdemir
 * @version 1409
 */
public class HistoricalMoment
{
    // instance variables
    private String eventName;
    private ClockDisplay timeOfEvent;

    /**
     * First constructor creates an event named "untitled event"
     * and a ClockDisplay for the timeOfEvent instance variable
     * and set its time to midnight by default
     */
    public HistoricalMoment()
    {
        eventName = "untitled event";
        timeOfEvent = new ClockDisplay();
    }

    /**
     * Second constructor has a String parameter.
     */
    public HistoricalMoment(String nameOfTheEvent)
    {
        if((nameOfTheEvent == null) || (nameOfTheEvent.equals(""))) {

            eventName = "untitled event";
            timeOfEvent = new ClockDisplay();
        }else{
            eventName = nameOfTheEvent; 
            timeOfEvent = new ClockDisplay();

        }

    }

    /**
     * Third constructor has 2 parameters
     */
    public HistoricalMoment(String nameOfTheEvent, ClockDisplay theTime)
    {
        if((nameOfTheEvent == null ) || (nameOfTheEvent.equals("")))
        {
            nameOfTheEvent = "untitled event";
            throw new IllegalArgumentException("cant be null or empty");

        }else{
            eventName = nameOfTheEvent;
            timeOfEvent = theTime;

        }

        if(theTime == null)
        {
            timeOfEvent = new ClockDisplay(0,0);
        }
    }
    
    /**
     * addMinuteToTimeOfEvent method does that by calling timeOfEvent's timeTick() method.
     */
    public void addMinuteToTimeOfEvent()
    {
        timeOfEvent.timeTick();
    }   
        
    
}


