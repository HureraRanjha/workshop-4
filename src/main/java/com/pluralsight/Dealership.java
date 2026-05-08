package com.pluralsight;

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

    public Vehicle[] getVehiclesByPrice(int min, int max)
    {
        return null;
    }

    public Vehicle[] getVehiclesByMakeModel(String make, String model)
    {
        return null;
    }

    public Vehicle[] getVehiclesByYear(int min, int max)
    {
        return null;
    }

    public Vehicle[] getVehiclesByColor(String color)
    {
        return null;
    }

    public Vehicle[] getVehiclesByMileage(int min, int max)
    {
        return null;
    }

    public Vehicle[] getVehiclesByType(String vehicleType)
    {
        return null;
    }

    public ArrayList<Vehicle> getAllVehicles()
    {
        ArrayList<Vehicle> inventoryCopy = new ArrayList<>();
        Collections.copy(inventory, inventoryCopy);
        return inventoryCopy;
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
