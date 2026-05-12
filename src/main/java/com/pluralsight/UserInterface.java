package com.pluralsight;

import java.sql.SQLOutput;
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
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "0":
                    System.out.println("Thanks for dropping by!");
                    break;
                default:
                    System.out.println("Invalid Input! Retry");
                    break;
            }
        } while (!userInput.equals("0"));
    }

    private void processGetByPriceRequest()
    {
        int min = 0;
        int max = 0;
        String userInput;

        System.out.println("What is the minimum price: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  min = Integer.parseInt(userInput);

        System.out.println("What is the maximum price: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  max = Integer.parseInt(userInput);

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByPrice(min, max);

        displayVehicles(vehicles);

    }

    private void processGetByMakeModelRequest()
    {
        System.out.println("What is the make of the car: ");
        String make = scanner.nextLine();

        System.out.println("What is the model of the car: ");
        String model = scanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByMakeModel(make, model);

        displayVehicles(vehicles);
    }

    private void processGetByYearRequest()
    {
        int min = 0;
        int max = 0;
        String userInput;

        System.out.println("What is the minimum year: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  min = Integer.parseInt(userInput);

        System.out.println("What is the maximum year: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  max = Integer.parseInt(userInput);

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByYear(min, max);

        displayVehicles(vehicles);

    }

    private void processGetByColorRequest()
    {
        System.out.println("What is the color you want: ");
        String color = scanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByColor(color);

        displayVehicles(vehicles);

    }

    private void processGetByMileageRequest()
    {
        int min = 0;
        int max = 0;
        String userInput;

        System.out.println("What is the minimum mileage: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  min = Integer.parseInt(userInput);

        System.out.println("What is the maximum mileage: ");
        if(!(userInput = scanner.nextLine()).isEmpty() )  max = Integer.parseInt(userInput);

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByMileage(min, max);

        displayVehicles(vehicles);

    }

    private void processGetByVehicleTypeRequest()
    {
        System.out.println("What is the vehicle type you want: ");
        String type = scanner.nextLine();

        ArrayList<Vehicle> vehicles = dealership.getVehiclesByType(type);

        displayVehicles(vehicles);

    }

//    private void processGetAllVehiclesRequest()
//    {
//    }

    private void processAddVehicleRequest()
    {
        System.out.println("What type of vehicle do you want to add: ");
        System.out.println("What is the vin: ");
        int vin = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the make: ");
        String make = scanner.nextLine();

        System.out.println("What is the model: ");
        String model = scanner.nextLine();

        System.out.println("What is the vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("What is the color: ");
        String color = scanner.nextLine();

        System.out.println("What is the odometer: ");
        int odometer = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the price: ");
        double price = Double.parseDouble(scanner.nextLine());

        dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
    }

    private void processRemoveVehicleRequest()
    {
        System.out.println("What type of vehicle do you want to add: ");
        System.out.println("What is the vin: ");
        int vin = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the make: ");
        String make = scanner.nextLine();

        System.out.println("What is the model: ");
        String model = scanner.nextLine();

        System.out.println("What is the vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("What is the color: ");
        String color = scanner.nextLine();

        System.out.println("What is the odometer: ");
        int odometer = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the price: ");
        double price = Double.parseDouble(scanner.nextLine());

        dealership.removeVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
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
            System.out.printf("%d %d, %s %s %s %s %d %.2f \n",
                    v.getVin(), v.getYear(), v.getMake(), v.getModel(), v.getVehicleType(), v.getColor(), v.getOdometer(), v.getPrice());
        }
    }

    public void processGetAllVehiclesRequest()
    {
        ArrayList<Vehicle> dealershipVehicles = dealership.getAllVehicles();
        displayVehicles(dealershipVehicles);
    }
}
