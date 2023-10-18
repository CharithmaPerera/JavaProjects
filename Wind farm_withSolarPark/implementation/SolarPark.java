package implementation;


/**
 * Write a description of class SolarPark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SolarPark extends GenericFarm
{
    private double landSize;
    private int  connectionYear;

    /**
     * Konstruktor für Objekte der Klasse PowerPlant
     */
    public SolarPark ( String name, String country, double capacity, int landSize, int  connectionYear)
    {
    
        super(name,country,capacity);
        this.landSize=landSize;
        this.connectionYear=connectionYear;
    }
    
    public String toString()
    {

        return String.format("%n| %-20s | %-15s | %-7.2f | %-15s |  %-5s | %-18s | %-14s |%-15.2f|%-15d| ",name,country,capacity,"","","","",landSize, connectionYear);
    }
   
    public void print()
    {
    System.out.println(toString());
    }


}
