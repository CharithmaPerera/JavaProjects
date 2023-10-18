import client.*;
import implementation.*;
import common.*;
/**
 * Write a description of class Application here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Application

{

    public static void main(String args[])
    {

        WindFarmTable windFarmTable1 = new WindFarmTable("table1");
        windFarmTable1.addPowerStation(new WindFarm("Triton Knoll", "UK", 857, 90, 2021));
        windFarmTable1.addPowerStation(new WindFarm("Hornsea", "UK", 1218, 174, 2019));
        windFarmTable1.addPowerStation(new WindFarm("Walney", "UK", 1026, 102, 2018));
        windFarmTable1.addPowerStation(new WindFarm("Jiangsu Quidong", "China", 802, 134, 2021));
        windFarmTable1.addPowerStation(new WindFarm("Borssele 1&2","Netherlands",752,94,2020));
        windFarmTable1.addPowerStation(new WindFarm("Gemini","Netherlands",600,150,2017));
        windFarmTable1.addPowerStation(new PowerPlant("Akkuyu","Turkey", 4456, 2015,2023));
        windFarmTable1.addPowerStation(new PowerPlant("El Dabaa","Egypt", 1194, 2022,2026));
        windFarmTable1.addPowerStation(new PowerPlant("¯Oma","Japan",1325,2010,2028));
        windFarmTable1.addPowerStation(new PowerPlant("San’ao","China",2234,2020,2026));
        windFarmTable1.addPowerStation(new PowerPlant("Xudabao","China",24,2021,2028));
        windFarmTable1.addPowerStation(new PowerPlant("Vogtle (expansion)","United States",2234,2012,2023));
        windFarmTable1.addPowerStation(new PowerPlant("Zhangzhou","China",2252,2019,2024));
        windFarmTable1.addPowerStation(new SolarPark("Al Kharsaah","Qatar",800,13,2022));
        windFarmTable1.addPowerStation(new SolarPark("Danangouxiang","China",1020,92,2021));
        windFarmTable1.addPowerStation(new SolarPark("Wulanmulun","China",500,28,2021));
        windFarmTable1.printTable();
        

    }

   
    
}
