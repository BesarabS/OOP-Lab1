package lab1;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private CarType carType;
    private Person owner;
    private List<Service> services = new ArrayList<>();


    public Car(String model, CarType carType, Person owner) {
        this.model = model;
        this.carType = carType;
        this.owner = owner;
    }

    public void printShortInfo() {
        System.out.printf("Short info. model: %s%n", model);
        System.out.println("owner: " + "services: " + services.size());

    }

    public void PrintInfo() {
        System.out.printf("ServiceInfo. model: %s, carType: %s", model, carType);
        System.out.print(" Owner: ");
        owner.printInfo();
        System.out.println();

        System.out.println("Car services ");
        for (Service service : services) {
            service.printInfo();
        }
        System.out.println("________________");
    }

    public void addService(Service service) {
        services.add(service);
    }

    public List<Service> getServices() {
        return services;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
