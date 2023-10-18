package implementation;


/**
 * The PowerPlant class represents a nuclear power plant under construction.
 * It holds the power plant's details relevant in our context.
 * 
 * @author (Karim Haidar) 
 * @version (October 22th 2022)
 */
public  class PowerPlant extends GenericFarm
{
    // // Instanzvariablen 
    // private String name;
    // private String country;
    // private double capacity;
    private int constructionStart;
    private int  connectionYear;

    /**
     * Konstruktor für Objekte der Klasse PowerPlant
     */
    public PowerPlant( String name, String country, double capacity, int constructionStart, int  connectionYear)
    {
        // this.name=name;
        // this.country=country;
        // this.capacity=capacity;
        super(name,country,capacity);
        this.constructionStart=constructionStart;
        this.connectionYear=connectionYear;
    }
   

    // /**
     // * printing the stored nuclear power plant information to the terminal window in the sequence as given in the wikipedia table.
     // */
    // public void printk()
    // {
        // System.out.println("Power station: " + name + ", Capacity= " + capacity + ", Construction start: " + constructionStart + ", Connection year: " + connectionYear + ", Country: " + country );
    
    // }
    
    // /**
     // *  Return the capacity of the power plant.
     // */
    // public double getCapacity()
    // {
        // return capacity;
    // }
    
    // public String getCountry()
    // {
        // return country;
    // }
    
    // public static String getHeader()
    // {
        // return String.format("| %-16s | %-4s | %-4s | %-4s | %-14s |%n","Power station","Capacity","Construction start","planned connection","country") +
        // "........................................................................................";
    // }
    
    public String toString()
    {

        return String.format("%n| %-20s | %-15s | %-7.2f | %-15s |  %-5s | %-18d | %-14d |%-15s|%-15s| ",name,country,capacity,"","",constructionStart, connectionYear,"","");
    }
    
    // /**
     // * print the power plant information.
     // */
    // public void printAll()
    
    // {
        // System.out.printf("%n| %-16s | %-8s | %-18s |%-15d | %-5d  %-18s | %-14s |",name ,country,capacity,"","", constructionStart, connectionYear);
    // }

    public void print()
    {
    System.out.println(toString());
    }
}
