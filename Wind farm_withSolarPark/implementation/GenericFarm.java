package implementation;

import common.*;
/**
 * Write a description of class GenericFarm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class GenericFarm implements IWindFarm
{
    public String name;
    public String country;
    public double capacity;

    /**
     * Constructor for objects of class GenericFarm
     */
    public GenericFarm( String name, String country, double capacity)
    {
        this.name = name;
        this.country = country;
        this.capacity = capacity;
    }

    /**
     * returning the capacity of a wind farm
     */
    public double getCapacity()
    {
        return capacity;
    }

    public String getCountry()
    {
        return country;
    }

    public abstract void print();

    // public abstract void printAll();

    public abstract String toString();
}
