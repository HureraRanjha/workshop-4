package com.pluralsight;

public class SalesContract extends Contract
{
    private static final double FOUR_YEAR_RATE = 0.0425;
    private static final double TWO_YEAR_RATE = 0.05;
    private double salesTaxAmount = 0.05;
    private int recordingFee = 100;
    private int processingFee;
    private boolean isFinance;
    private double monthlyPayment;

    public SalesContract(String date, String customerName, Vehicle vehicleSold, double totalPrice, double monthlyPayment, int processingFee, boolean isFinance, double monthlyPayment1)
    {
        super(date, customerName, vehicleSold, totalPrice, monthlyPayment);
        this.processingFee = (totalPrice > 10000) ? 295 : 495;
        this.isFinance = isFinance;
        //this.monthlyPayment = (this.isFinance && totalPrice >) ? ;
    }


    @Override
    public double getTotalPrice()
    {
        return 0;
    }

    @Override
    public double getMonthlyPayment()
    {
        if(!this.isFinance)
        {
            throw new IllegalStateException("You cant get a monthly payment if you dont finance!");
        }

        double totalPrice = this.getTotalPrice();
        double paymentTotal;
        if(this.getVehicleSold().getPrice() >= 10_000)
        {
            paymentTotal = totalPrice * Math.pow(1 + FOUR_YEAR_RATE, 4);
            return paymentTotal / 48;
        }
        else
        {
            paymentTotal = totalPrice * Math.pow(1 + TWO_YEAR_RATE, 2);
            return paymentTotal / 12;
        }
    }
}
