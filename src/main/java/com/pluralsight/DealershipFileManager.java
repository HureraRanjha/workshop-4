package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager
{
    String INVENTORY_PATH = "src/main/resources/inventory.csv";

    public Dealership getDealership()
    {
        String name = "";
        String address = "";
        String phone = "";
        Dealership dealership = null;

        try
        {
            FileReader fileReader = new FileReader(INVENTORY_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String[] dealerShipHeader = bufferedReader.readLine().split("\\|");

            name = dealerShipHeader[0];
            address = dealerShipHeader[1];
            phone = dealerShipHeader[2];

            dealership = new Dealership(name, address, phone);

            String input = "";
            while((input = bufferedReader.readLine()) != null)
            {
                String[] parsedVehicle = input.split("\\|");
                int vin = Integer.parseInt(parsedVehicle[0]);
                int year = Integer.parseInt(parsedVehicle[1]);
                String make = parsedVehicle[2];
                String model = parsedVehicle[3];
                String vehicleType = parsedVehicle[4];
                String color = parsedVehicle[5];
                int odometer = Integer.parseInt(parsedVehicle[6]);
                double price = Double.parseDouble(parsedVehicle[7]);

                dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
            }
        }
        catch(FileNotFoundException e)
        {
            System.err.println("Something wrong reading the file");
        }
        catch(IOException e)
        {
            System.err.println("Cannot open the file");
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership)
    {

    }
}
