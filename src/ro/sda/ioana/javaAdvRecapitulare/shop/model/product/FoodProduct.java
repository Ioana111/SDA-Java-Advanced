package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

import java.util.Date;

public abstract class FoodProduct implements Sellable {

    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        this.expirationDate = expirationDate;
        this.isBio = isBio;
        this.countryOfOrigin = countryOfOrigin;
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

