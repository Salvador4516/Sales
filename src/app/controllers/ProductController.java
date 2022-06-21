package app.controllers;

import app.models.Product;
import app.utils.Rounder;
import app.views.SalesView;

public class ProductController {

    Product model;
    SalesView view;

      public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String name = model.getName();

        double incomeInitial = model.incomeCalc(model.getQuantity(), model.getPrice());
        String incomeInitialRounder = Rounder.roundValue(incomeInitial);

        double tax = model.taxCalc(incomeInitial);
        String taxRounded = Rounder.roundValue(tax);

        String netIncomeRounded = Rounder.roundValue(model
                .netIncome(incomeInitial, tax));

        String output = "------------------------------\n" +
                "Название товара: " + name + "\n" +
                "Сумма дохода (грн.): " + incomeInitialRounder + "\n" +
                "Сумма налога (грн.): " + taxRounded + "\n" +
                "Чистый доход (грн.): " + netIncomeRounded;

        view.getOutput(output);
    }
}
