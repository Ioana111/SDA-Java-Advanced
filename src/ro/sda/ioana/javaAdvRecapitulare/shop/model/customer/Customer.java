package ro.sda.ioana.javaAdvRecapitulare.shop.model.customer;

/**
 * **2. Composition**
 * - create the class Customer that encapsulates the fallowing data:
 *     - id: String
 *     - address: String
 *     - phone: String
 *     - email: String
 *     - an Account instance
 * - The class Customer should have a constructor with all the files and getters for all the fields.
 */

public class Customer {
    private String id;
    private String address;
    private String phone;
    private String email;
    private Account account;
    private CustomerState state;


    public Customer(String id, String address, String phone, String email, Account account, CustomerState state) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.account = account;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                ", state=" + state +
                '}';
    }
}
