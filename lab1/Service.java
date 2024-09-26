package lab1;

public class Service {
    private String serviceName;
    private String price;
    private Date serviceDate;


    public Service(String serviceName, String price, Date serviceDate) {
    this.serviceName = serviceName;
    this.price = price;
    this.serviceDate = serviceDate;
    }

    public void printInfo() {
        System.out.printf("ServiceInfo. serviceName: %s, price: %s%n ", serviceName, price);
        System.out.println("Service date: ");
        serviceDate.PrintInfo();
        System.out.println("________________");
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceDate(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }
}
