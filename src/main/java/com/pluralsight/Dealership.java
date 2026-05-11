package com.pluralsight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Dealership
{
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone)
    {
        this.name = name;
        this.address = address;
        this.phone = phone;

        this.inventory = new ArrayList<>();
    }

    public String getName() {return name; }
    public void setName(String name) {this.name = name;}

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getPrice() > min && v.getPrice() < max)
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getMake().equals(make) && v.getModel().equals(model))
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getYear() > min && v.getYear() < max)
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getColor().equals(color) )
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getOdometer() > min && v.getOdometer() < max)
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByType(String vehicleType)
    {
        ArrayList<Vehicle> filteredVehicles = new ArrayList<>();
        for(Vehicle v: inventory)
        {
            if(v.getVehicleType().equals(vehicleType))
            {
                filteredVehicles.add(v);
            }
        }
        return filteredVehicles;
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        return new ArrayList<>(inventory);
    }

    public void addVehicle(Vehicle vehicle)
    {
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle)
    {
        inventory.remove(vehicle);
    }

}
