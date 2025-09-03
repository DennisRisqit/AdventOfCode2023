package main.java.com.example.AoD5;

import java.io.File;
import java.util.*;

public class AoD_Day5_Part1 {
    public static void aoD_Day5_Part1(){

        List<Long> seedList = new ArrayList<>();

        ArrayList<SeedMapping> seedToSoilMaps = new ArrayList<>();

        ArrayList<SeedMapping> SoilToFertilizerMap = new ArrayList<>();
        ArrayList<SeedMapping> FertilizerToWaterMap  = new ArrayList<>();
        ArrayList<SeedMapping> WaterToLightMap  = new ArrayList<>();
        ArrayList<SeedMapping> LightToTemperatureMap  = new ArrayList<>();
        ArrayList<SeedMapping> TemperatureToHumidityMap  = new ArrayList<>();
        ArrayList<SeedMapping> HumidityToLocationMap  = new ArrayList<>();

        File file = new File("src/test-input.txt");
        CheckFileExists.checkFileExists(file);
        HashMap<Integer,String> FileData = ReadFileData.readFileData(file);

        String ActiveMap = "";

        for(int key: FileData.keySet()){
            String seedValues =  FileData.get(key);

            String[] SplitValues = seedValues.split(" ");
            if(key == 0){
                for(String seed: SplitValues){
                    if(!seed.matches("^([a-z-:]*)")){
                        seedList.add(Long.parseLong(seed));
                    }
                }
            }
            else{
                if(seedValues.matches("^([a-z-: ]*)")){
                    System.out.printf("Setting : %s Active %n",seedValues);
                    if(seedValues.matches("seed-to-soil map:")){ActiveMap = "seedToSoilMaps";}
                    if(seedValues.matches("soil-to-fertilizer")){ActiveMap = "SoilToFertilizerMap";}
                    if(seedValues.matches("fertilizer-to-water map:")){ActiveMap = "FertilizerToWaterMap";}
                    if(seedValues.matches("water-to-light map:")){ActiveMap = "WaterToLightMap";}
                    if(seedValues.matches("light-to-temperature map:")){ActiveMap = "LightToTemperatureMap";}
                    if(seedValues.matches("temperature-to-humidity map:")){ActiveMap = "TemperatureToHumidityMap";}
                    if(seedValues.matches("humidity-to-location map:")){ActiveMap = "HumidityToLocationMap";}
                }
                else{
                    switch (ActiveMap){
                        case "seedToSoilMaps":
                            seedToSoilMaps.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                        case "SoilToFertilizerMap":
                            SoilToFertilizerMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                            case "FertilizerToWaterMap":
                                FertilizerToWaterMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                        case "WaterToLightMap":
                            WaterToLightMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                        case "LightToTemperatureMap":
                            LightToTemperatureMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                        case "TemperatureToHumidityMap":
                            TemperatureToHumidityMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                        case "HumidityToLocationMap":
                            HumidityToLocationMap.add(new SeedMapping(
                                    Long.parseLong(SplitValues[0]),Long.parseLong(SplitValues[1]),Long.parseLong(SplitValues[2])));
                            break;
                    }

                }


            }


        }

        System.out.println(seedList);

    }
}