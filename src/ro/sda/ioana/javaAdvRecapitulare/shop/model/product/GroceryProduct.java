package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

import ro.sda.ioana.javaAdvRecapitulare.shop.exceptions.InvalidProductDataException;
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
        if (price > 0) {
            this.price = price;
        } else {
            throw new InvalidProductDataException("Price is not valid");
        }
        if (currency != null) {
            this.currency = currency;
        }else {
            throw new InvalidProductDataException("There's no currency");
        }
        if(name != null && !name.isBlank()){
            this.name = name;
        }else {
            throw new InvalidProductDataException("There's no name");
        }
        if(description != null && !description.isBlank()) {
            this.description = description;
        }else {
            throw new InvalidProductDataException("There's no description");
        }
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
