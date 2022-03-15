package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

import ro.sda.ioana.javaAdvRecapitulare.shop.exceptions.InvalidProductDataException;

import java.util.Date;

public abstract class FoodProduct implements Sellable {

    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        if (expirationDate != null && expirationDate.after(new Date())) {
            this.expirationDate = expirationDate;
        } else {
            throw new InvalidProductDataException("Product is expired!");
        }
        this.isBio = isBio;
        if (countryOfOrigin != null && !countryOfOrigin.isBlank()) {
            this.countryOfOrigin = countryOfOrigin;
        }else {
            throw new InvalidProductDataException("Product does not have an origin country.");
        }

    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.FOOD;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}

