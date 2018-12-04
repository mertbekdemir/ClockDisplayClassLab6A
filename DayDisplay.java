
/**
 * DayDisplay class .
 *
 * @author Mert Bekdemir
 * @version 1409
 */
public class DayDisplay
{
    // Constants
    public static final int NUMBER_OF_DAYS_IN_WEEK = 7;
    public static final int SUNDAY                 = 0;
    public static final int MONDAY                 = 1;
    public static final int TUESDAY                = 2;
    public static final int WEDNESDAY              = 3;
    public static final int THURSDAY               = 4;
    public static final int FRIDAY                 = 5;
    public static final int SATURDAY               = 6;

    public static final String SUNDAY_STRING       = "Sunday";
    public static final String MONDAY_STRING       = "Monday";
    public static final String TUESDAY_STRING      = "Tuesday";
    public static final String WEDNESDAY_STRING    = "Wednesday";
    public static final String THURSDAY_STRING     = "Thursday";
    public static final String FRIDAY_STRING       = "Friday";
    public static final String SATURDAY_STRING     = "Saturday";

    //Instance variables 
    private NumberDisplay dayNumber;

    /**
     * Constructor for DayDisplay objects. This constructor initializes the dayNumber instance variable, 
     * but only if is an integer between 0 and 6; otherwise set the day to 0 and print an error message.
     */
    public DayDisplay(int theDayNumber)
    {
        if((theDayNumber >= 0) && (theDayNumber <= 6)){

            dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
            dayNumber.setValue(theDayNumber);

        }else{
            dayNumber = new NumberDisplay(0);
            throw new IllegalArgumentException("must be between zero and six, inclusive");
        }
    }

    /**
     * Second Constructor
     */
    public DayDisplay(String nameOfTheDay)
    {
        if(nameOfTheDay != null){
            dayNumber = new NumberDisplay(NUMBER_OF_DAYS_IN_WEEK);
        
        if(nameOfTheDay.equalsIgnoreCase(SUNDAY_STRING)){
            dayNumber.setValue(SUNDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(MONDAY_STRING)){
            dayNumber.setValue(MONDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(TUESDAY_STRING)){
            dayNumber.setValue(TUESDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(WEDNESDAY_STRING)){
            dayNumber.setValue(WEDNESDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(THURSDAY_STRING)){
            dayNumber.setValue(THURSDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(FRIDAY_STRING)){
            dayNumber.setValue(FRIDAY);
        }else if(nameOfTheDay.equalsIgnoreCase(SATURDAY_STRING)){
            dayNumber.setValue(SATURDAY);
        }else{
            throw new IllegalArgumentException("invalid  name");
        }    
    }

    }

    /**
     * Third constructor 
     */
     public DayDisplay(NumberDisplay theDay)
    {
        if (null != theDay) {

            dayNumber = theDay;
        }else{
            throw new IllegalArgumentException("invalid number display");

        }
    }

    public  String getDayOfTheWeek(){

         String dayStr = "";
        
        switch(dayNumber.getValue()){

            case SUNDAY:
            dayStr = SUNDAY_STRING;
            break;
            case MONDAY:
            dayStr = MONDAY_STRING;
            break;
            case TUESDAY:
            dayStr = TUESDAY_STRING;
            break;
            case WEDNESDAY:
            dayStr = WEDNESDAY_STRING;
            break;
            case THURSDAY:
            dayStr = THURSDAY_STRING;
            break;
            case FRIDAY:
            dayStr = FRIDAY_STRING;
            break;
            case SATURDAY:
            dayStr = SATURDAY_STRING;
            break;
            default:
            System.out.println("invalid name for day");

        }
        
        return dayStr;
    }

    public void incrementDay(){

        dayNumber.increment();
    }

    public String getWhatDayIsTomorrow(){
        
        String nextDay = "";

        switch(dayNumber.getValue()){
            
            case SUNDAY:
            nextDay = MONDAY_STRING;
            break;
            case MONDAY:
            nextDay = TUESDAY_STRING;
            break;
            case TUESDAY:
            nextDay = WEDNESDAY_STRING;
            break;
            case WEDNESDAY:
            nextDay = THURSDAY_STRING;
            break;
            case THURSDAY:
            nextDay = FRIDAY_STRING;
            break;
            case FRIDAY:
            nextDay = SATURDAY_STRING;
            break;
            case SATURDAY:
            nextDay = SUNDAY_STRING;
            break;
            default:
            System.out.println("invalid name for day");
        }
        
        return nextDay;
    }
    public void printDetails(){
        
        System.out.println("Today is day " +dayNumber.getValue()+" which is "+ getDayOfTheWeek());
        
    }
    
   
}
