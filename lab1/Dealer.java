package lab1;

public class Dealer extends Person {
    private String dealerId;
    private String companyName;

    public Dealer() {
    }

    public Dealer(String name,
                  String surname,
                  Date birthdate,
                  String dealerId,
                  String companyName) {
        super(name, surname, birthdate);
        this.dealerId = dealerId;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() + ", dealerId=%s, companyName=%s".formatted(dealerId, companyName);
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
