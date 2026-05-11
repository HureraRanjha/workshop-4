package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface
{
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    public UserInterface()
    {}

    public void display()
    {
        init();
        String userInput;
        do
        {
            System.out.println("""
                    1. Get Vehicle By Price
                    2. Get Vehicle By Make Model
                    3. Get Vehicle By Year
                    4. Get Vehicle By Color
                    5. Get Vehicle By Mileage
                    6. Get Vehicle By Vehicle Type
                    7. Get All Vehicles
                    8. Add Vehicle
                    9. Remove Vehicle
                    0. Exit
                    """);
            userInput = scanner.nextLine();
            switch(userInput)
            {
                case "1":
                    processGetByPriceRequest();
                case "2":
                    processGetByMakeModelRequest();
                case "3":
                    processGetByYearRequest();
                case "4":
                    processGetByColorRequest();
                case "5":
                    processGetByMileageRequest();
                case "6":
                    processGetByVehicleTypeRequest();
                case "7":
                    processGetAllVehiclesRequest();
                case "8":
                    processAddVehicleRequest();
                case "9":
                    processRemoveVehicleRequest();
                case "0":
                    System.out.println("Thanks for dropping by!");
                    break;
            }
        } while (!userInput.equals("0"));
    }

    private void processGetByPriceRequest()
    {
    }

    private void processGetByMakeModelRequest()
    {
    }

    private void processGetByYearRequest()
    {
    }

    private void processGetByColorRequest()
    {
    }

    private void processGetByMileageRequest()
    {
    }

    private void processGetByVehicleTypeRequest()
    {
    }

    private void processGetAllVehiclesRequest()
    {
    }

    private void processAddVehicleRequest()
    {
    }

    private void processRemoveVehicleRequest()
    {
    }

    private void init()
    {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
    }

    private void displayVehicles(ArrayList<Vehicle> vehicles)
    {
        for(Vehicle v: vehicles)
        {
            System.out.printf("%d %d, %s %s %s %s %d %f",
                    v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
        }
    }

    public void processAllVehiclesRequest()
    {
        ArrayList<Vehicle> dealershipVehicles = dealership.getAllVehicles();
        displayVehicles(dealershipVehicles);
    }
}
