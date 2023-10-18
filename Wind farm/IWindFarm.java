
/**
 * Write a description of interface IWindFarm here.
 *
 * @author Charithma Perera
 * @version 27.11.2022
 */
public interface IWindFarm
{
    /**
     * An example of a method header - replace this comment with your own
     *
     * @param  y a sample parameter for a method
     * @return   the result produced by sampleMethod
     */
    public static String getHeader()
    {
        return String.format("| %-20s | %-15s | %-7s | %-17s |  %-5s |%n","Wind farm","Capacity (MW)","Country","No of turbines","Year") +
        "....................................................................................";
    }
    
    public void print();
    public double getCapacity();
    public String getCountry();
    

}
