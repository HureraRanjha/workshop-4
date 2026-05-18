package com.pluralsight;

public abstract class Contract
{
    protected String date;
    protected String customerName;
    protected Vehicle vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String date, String customerName, Vehicle vehicleSold, double totalPrice, double monthlyPayment)
    {
        this.date = date;
        this.customerName = customerName;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public Vehicle getVehicleSold()
    {
        return vehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold)
    {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
