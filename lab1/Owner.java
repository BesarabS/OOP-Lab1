package lab1;

public class Owner extends Person {
    private String driverLicenseNumber;
    private String contactNumber;
    public Owner() {}

    public Owner(String name,
                 String surname,
                 Date birthdate,
                 String driverLicenseNumber,
                 String contactNumber) {
        super(name, surname, birthdate);
        this.driverLicenseNumber = driverLicenseNumber;
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", driverLicenseNumber=%s, contactNumber=%s".formatted(driverLicenseNumber, contactNumber);
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
