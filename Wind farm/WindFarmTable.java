import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;

/**
 * Wind farm table gives all the information related to all the windfarms 
 * in a table. It also provides the total power of all the wind farms
 * instances created.
 *
 * @author (Charithma Perera)
 * @version (19.10.2022)
 */
public class WindFarmTable
{

    private String turbineName;
    private ArrayList<WindFarm> powerStations;
    private double totalPower;
    public boolean alreadyExecuted;
    /**
     * Constructor for objects of class WindFarmTable
     */
    public WindFarmTable(String name)
    {
        turbineName = name;
        powerStations = new ArrayList <WindFarm>();
        // stations = new HashSet <WindFarm>();
    }

    /**
     * Creating an Array List for the Wind farms
     */
    public void addPowerStation(WindFarm powerStation)
    {
        powerStations.add(powerStation);
        totalPower += powerStation.getCapacity();
    }

    /**
     * Return the total power (capacity) of all th wind farms 
     * that are added in the table
     */
    public double getTotalPower()
    {
        // totalPower =0.0;
        // Iterator<WindFarm> it = powerStations.iterator();
        // while(it.hasNext()){
        // totalPower += it.next().getCapacity();
        // }

        return totalPower;
    }

    /**
     * Printing a table with all the information about th wind farms
     */
    public void printTable()
    {
        System.out.printf("| %-20s | %-15s | %-7s | %-17s |  %-5s |%n","Wind farm","Capacity (MW)","Country","No of turbines","Year");
        System.out.printf("........................................................................................");
        for (WindFarm powerStation : powerStations ){
            powerStation.printAll();
        }

    }

    private void initialList()
    {
        WindFarm windFarm1 = new WindFarm("Triton Knoll", "UK", 857, 90, 2021);
        WindFarm windFarm2 = new WindFarm("Hornsea", "UK", 1218, 174, 2019);
        WindFarm windFarm3 = new WindFarm("Walney", "UK", 1026, 102, 2018);
        WindFarm windFarm4 = new WindFarm("Jiangsu Quidong", "China", 802, 134, 2021);
        WindFarm windFarm5 = new WindFarm("Borssele 1&2","Netherlands",752,94,2020);
        WindFarm windFarm6 = new WindFarm("Gemini","Netherlands",600,150,2017);
        addPowerStation(windFarm1);
        addPowerStation(windFarm2);
        addPowerStation(windFarm3);
        addPowerStation(windFarm4);
        addPowerStation(windFarm5);
        addPowerStation(windFarm6);
    }

    public void initList()
    {

        if(!alreadyExecuted) {
            initialList();
            alreadyExecuted = true;
        }

    }

    /**
     * Method listWindFarms prints all WindFarm instances 
     * located in the country to the terminal
     *
     * @param country A parameter that is the key word to be searched in the arraylist.
     */
    public void listWindFarms(String country){

        System.out.println(WindFarm.getHeader());

        for(WindFarm powerStation : powerStations){
            if(powerStation.getCountry().equals( country)){
                System.out.println(powerStation.toString());
            }

        }

    }

    /**
     * Method findWindFarms adds all WindFarm instances 
     * located in the country to a set
     *
     * @param country is the country name 
     * @return a set of all WindFarm instances 
     * located in the country
     */
    public HashSet<WindFarm> findWindFarms(String country){
        HashSet<WindFarm> stations= new HashSet<WindFarm>();
        for(WindFarm powerStation : powerStations ){
            if(powerStation.getCountry() .equals(country)){
                stations.add(powerStation);
            }
        }
        return stations;
    }

    /**
     * Method listByCountry prints country first and then the wind farms related to it.
     *
     */
    public void listByCountry(){
        HashSet<String> countries = new HashSet<String>();
        for (WindFarm powerStation: powerStations){
            countries.add(powerStation.getCountry());
        }

        for(String country : countries){
            System.out.println("Country : " + country);
            listWindFarms(country);
            System.out.println();
        }

    }

    /**
     * Method powerByCountry Return a HashSet which stores for each country the total power of wind farms in the table as the value.
     *
     * @return the total power of wind farms in a particular country     */
    public HashMap<String, Double> powerByCountry()
    {

        HashMap<String, Double> powerByCountry = new HashMap<String,Double>();
        for (WindFarm powerStation: powerStations)

        {   
            String country = powerStation.getCountry();
            double capacity = powerStation.getCapacity();

            if(powerByCountry.containsKey(country)){
                double tempCapacity = powerByCountry.get(country);
                powerByCountry.put(powerStation.getCountry(),tempCapacity + capacity);
            }
            else 
                powerByCountry.put(country,capacity);
                
        }
        // for (String i : powerByCountry.keySet()){
        // System.out.println("key:" + i + "value:" + powerByCountry.get(i));
        // }
        return powerByCountry;
    }

    /**
     * Method printCapacity prints the total capacity of all the wind farms in the country.
     *
     * @param powerByCountry gives the total power of wind farms in a particular country
     */
    public void printCapacity(HashMap<String,Double> powerByCountry)
    {
        System.out.println(String.format ("%-20s |   %-20s\n---------------------------------","Country","Capacity"));

        HashSet<String> countries = new HashSet<String>();

        for (WindFarm powerStation : powerStations)
            countries.add(powerStation.getCountry());

        for(String country : countries){
            System.out.println(String.format ("%-20s |   %-20.1f\n---------------------------------",country,powerByCountry.get(country)));
        }
    }

    /**
     * Method mapByCountry Return a HasMap, which adds all the wind farms to the map. 
     * The keys are the countries and the value the set of wind farms in that country. 
     * @return Hash map with country and the wind farms in it.
     */
    public HashMap<String, HashSet<WindFarm>> mapByCountry()
    {
        HashMap<String, HashSet<WindFarm>> mapByCountry = new HashMap<String, HashSet<WindFarm>>();

        for (WindFarm powerStation : powerStations)
        {   String country = powerStation.getCountry();

            HashSet <WindFarm> windFarms = mapByCountry.getOrDefault(country,new HashSet<WindFarm>());
            windFarms.add(powerStation);
            mapByCountry.put(country,windFarms);

        }
        return mapByCountry;
    }

    /**
     * Method printMap Print the wind farm table by country given as an argument so that for each country the power plants are printed line by line.
  
     *
     * @param mapByCountry Hash map with country and the wind farms in it.
     */
    public void printMap(HashMap<String, HashSet<WindFarm>> mapByCountry)
    {
        for (String country : mapByCountry.keySet())
        {
            System.out.println("Country : " + country);
            System.out.println(WindFarm.getHeader());
            for (WindFarm windFarm : mapByCountry.get(country))
            {
                windFarm.print();
            }
            System.out.println("....................................................................................");
            System.out.println();
        }
    }
}