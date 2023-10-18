
/**
 * Wind farm class Collect information about offshore wind farms.
 *
 * @author (Charithma Perera)
 * @version (19.10.2022)
 */
public class WindFarm implements IWindFarm
{

    private String turbineName;
    private String location;
    private double cap;
    private int noTurbines;
    private int yearMade;

    /**
     * Constructor for objects of class WindFarm
     */
    public WindFarm(String name, String country, double capacity, int numberTurbines, int year)
    {
        //this(name,country,capacity,numberTurbines,year);
        turbineName = name;
        location = country;
        cap = capacity;
        noTurbines = numberTurbines;
        yearMade = year;

    }
    
    public static String getHeader()
    {
        return String.format("| %-20s | %-15s | %-7s | %-17s |  %-5s |%n","Wind farm","Capacity (MW)","Country","No of turbines","Year") +
        "....................................................................................";
    }
    
    public String toString()
    {
        return String.format("%n| %-20s | %-15s | %-7.2f | %-15d |  %-5d | ",turbineName,location,cap,noTurbines,yearMade);
    }

    /**
     * Printing all the information
     */
    public void print()
    {
        System.out.println(toString());
        //System.out.println(turbineName + " ,Country:" + location +",Capacity :"+ cap + ",No of turbines:"+ noTurbines + ",Year:"+yearMade);
    }

    /**
     * returning the capacity of a wind farm
     */
    public double getCapacity()
    {
        return cap;
    }
    
    public String getCountry()
    {
        return location;
    }
    
    public String getName()
    {
        return turbineName;
    }
    

    /**
     * Printing information in a table
     */
    public void printAll()
    {
        System.out.printf("%n| %-20s | %-15s | %-7.2f | %-15d |  %-5d | ",turbineName,location,cap,noTurbines,yearMade);

    }
    
   
    
}
