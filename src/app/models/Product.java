package app.models;

import app.base.Fiscal;
import app.base.Income;

public class Product implements Income, Fiscal {

    private String name;
    private int quantity;
    private double price;
    private int TAX_RATE = 5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double taxCalc(double income) {
        return income * TAX_RATE/100;
    }

    @Override
    public double incomeCalc(int quantity, double price) {
        return quantity * price;
    }

    @Override
    public double netIncome(double income, double tax) {
        return income - tax;
    }

}
