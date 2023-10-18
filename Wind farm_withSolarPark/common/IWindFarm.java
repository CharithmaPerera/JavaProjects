package common;


/**
 * Write a description of interface IWindFarm here.
 *
 * @author Charithma Perera
 * @version 27.11.2022
 */
public interface IWindFarm
{
   
  public static String getHeader()
    {
        return  String.format( "| %-20s | %-30s | %-25s | %-35s |%-30s|%n"+ "%n" +
                               "| %-20s | %-15s | %-7s | %-17s |  %-5s | %-18s | %-14s |%-15s|%-15s|%n","","Common Variables","Spec.Variable WindFarm","Spec.Variable PowerPlant","Spec.Variables SolarPark", "Name","Country","Capacity(MW)","No of turbines","Year","constructionStart", "ConnectionYear","LandSize","ConnectionYear") +
                               "..............................................................................................................";

    }
    
    public void print();
    public double getCapacity();
    public String getCountry();
    // public void printAll();

}
