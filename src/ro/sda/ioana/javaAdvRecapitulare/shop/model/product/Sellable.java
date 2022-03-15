package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

import ro.sda.ioana.javaAdvRecapitulare.shop.model.Currency;

/**
 * **4. Interface**
 * - create the interface Sellable with the fallowing methods:
 *     - getPrice()
 *     - getCurrency()
 *     - getName()
 *     - getDescription()
 *     - getProductCategory()
 */

public interface Sellable {

    double getPrice();

    Currency getCurrency();

    String getName();

    String getDescription();

    ProductCategory getProductCategory();


}
