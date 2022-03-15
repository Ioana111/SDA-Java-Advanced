package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

import ro.sda.ioana.javaAdvRecapitulare.shop.model.Currency;

import java.util.Date;

/**
 * **6. Inheritance**
 * - create new classes that will inherit the FoodProduct class
 * - GroceryProduct
 */

public class GroceryProduct extends FoodProduct {

    private double price;
    private Currency currency;
    private String name;
    private String description;


    public GroceryProduct(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            double price,
            Currency currency,
            String name,
            String description
    ) {
        super(expirationDate, isBio, countryOfOrigin);
        this.price = price;
        this.currency = currency;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
