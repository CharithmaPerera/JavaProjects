package client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import common.*;
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
    private ArrayList<IWindFarm> powerStations;
    private double totalPower;
    private HashSet<IWindFarm> stations;
    /**
     * Constructor for objects of class WindFarmTable
     */
    public WindFarmTable(String name)
    {
        turbineName = name;
        powerStations = new ArrayList <IWindFarm>();
        stations = new HashSet <IWindFarm>();
    }

    /**
     * Creating an Array List for the Wind farms
     */
    public void addPowerStation(IWindFarm powerStation)
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
        System.out.println(IWindFarm.getHeader());
        for (IWindFarm powerStation : powerStations ){
            System.out.println(powerStation.toString());
        }

    }

    // public void initList()
    // {
        // WindFarm windFarm1 = new WindFarm("Triton Knoll", "UK", 857, 90, 2021);
        // WindFarm windFarm2 = new WindFarm("Hornsea", "UK", 1218, 174, 2019);
        // WindFarm windFarm3 = new WindFarm("Walney", "UK", 1026, 102, 2018);
        // WindFarm windFarm4 = new WindFarm("Jiangsu Quidong", "China", 802, 134, 2021);
        // addPowerStation(windFarm1);
        // addPowerStation(windFarm2);
        // addPowerStation(windFarm3);
        // addPowerStation(windFarm4);
    // }

    /**
     * Method listWindFarms prints all WindFarm instances 
     * located in the country to the terminal
     *
     * @param country A parameter that is the key word to be searched in the arraylist.
     */
    public void listWindFarms(String country){

        System.out.println(IWindFarm.getHeader());
        for(IWindFarm powerStation : powerStations){
            if(powerStation.getCountry() == country){
                powerStation.print();
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
    public HashSet<IWindFarm> findWindFarms(String country){
        
        for(IWindFarm powerStation : powerStations ){
            if(powerStation.getCountry() == country){
                stations.add(powerStation);
            }
        }
        return stations;
    }
}