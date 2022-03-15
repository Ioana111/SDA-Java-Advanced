package ro.sda.ioana.javaAdvRecapitulare.shop.model.product;

/**
 * SoftwareProduct that implements Sellable and encapsulates the fallowing data:
 *   - receivedOnMail: boolean
 *   - sentOnDvdDisk: boolean
 *   - licenseType: String
 *   - releasedBy: String
 *   - create a constructor that will accept all the fields as parameters
 *   - add getters for releasedBy and licenseType
 *
 */
public abstract class SoftwareProduct implements Sellable{

    private boolean receivedOnMail;
    private boolean sentOnDvdDisk;
    private String licenseType;
    private String releasedBy;

//TODO: add validation on fields

    public SoftwareProduct(boolean receivedOnMail, boolean sentOnDvdDisk, String licenseType, String releasedBy) {
        this.receivedOnMail = receivedOnMail;
        this.sentOnDvdDisk = sentOnDvdDisk;
        this.licenseType = licenseType;
        this.releasedBy = releasedBy;
    }

    @Override
    public ProductCategory getProductCategory() {
        return ProductCategory.SOFTWARE;
    }

    public boolean isReceivedOnMail() {
        return receivedOnMail;
    }

    public void setReceivedOnMail(boolean receivedOnMail) {
        this.receivedOnMail = receivedOnMail;
    }

    public boolean isSentOnDvdDisk() {
        return sentOnDvdDisk;
    }

    public void setSentOnDvdDisk(boolean sentOnDvdDisk) {
        this.sentOnDvdDisk = sentOnDvdDisk;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getReleasedBy() {
        return releasedBy;
    }

    public void setReleasedBy(String releasedBy) {
        this.releasedBy = releasedBy;
    }
}
