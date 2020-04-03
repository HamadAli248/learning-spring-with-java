package newPackage;

public class UserRegistrationRequest {

    public String getFristName() {
        return FristName;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    private String FristName;
    private String LastName;
    private String voucherCode;
}
