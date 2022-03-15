package ro.sda.ioana.javaAdvRecapitulare.shop.model.customer;

/**
 * **3. Enums**
 * - create the enum CustomerState with some values (New, Active, Closed, Banned).
 *   Override the toString method to print the pretty name.
 * - create a method that should return if the state permits shopping
 */

public enum CustomerState {
    NEW("New",false),
    ACTIVE("Active",true),
    CLOSED("Closed",false),
    BANNED("Banned",false);

    private String prettyName;
    private boolean permiteShopping;

    CustomerState(String prettyName, boolean permiteShopping) {
        this.prettyName = prettyName;
        this.permiteShopping = permiteShopping;
    }

    public String getPrettyName() {
        return prettyName;
    }

    public void setPrettyName(String prettyName) {
        this.prettyName = prettyName;
    }

    public boolean isPermiteShopping() {
        return permiteShopping;
    }

    public void setPermiteShopping(boolean permiteShopping) {
        this.permiteShopping = permiteShopping;
    }

    @Override
    public String toString() {
        return "CustomerState{" +
                "prettyName='" + prettyName + '\'' +
                '}';
    }

}
