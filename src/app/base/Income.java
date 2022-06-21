package app.base;

public interface Income {

    double incomeCalc(int quantity,double price);

    double netIncome(double income, double tax);
}
