package lab1;

public class Main {
    public static void main(String[] args) {
        Person owner1 = new Person("Alec ","Buck", new Date(24, 11, 1983));
        Service service1 = new Service("Tire change", "100$", new Date(20, 5, 2024));
        Service service2 = new Service("Brake pads change", "150$", new Date(21, 5, 2024));

        Car car1 = new Car("Toyota Camry", CarType.SEDAN, owner1);
        car1.addService(service1);
        car1.addService(service2);

        System.out.println("car1 full info");
        car1.PrintInfo();
        System.out.println("__________________________________________________");

        System.out.println("car1 short info");
        car1.printShortInfo();
        System.out.println("__________________________________________________");

        Person person = car1.getOwner();
        System.out.println("car1 info via getter: ");
        person.printInfo();
        System.out.println("__________________________________________________");

        Person owner2 = new Person("Adam ", "Jackson", new Date(17, 8, 1986));
        Service service3 = new Service("Gas tank change", "180$", new Date(2, 6, 2024));
        Service service4 = new Service("Windshields repair", "200$", new Date(4, 6, 2024));


        Car car2 = new Car("Chevrolet TrailBlazer", CarType.SUV, owner2);
        car2.addService(service3);
        car2.addService(service4);

        System.out.println("car2 full info");
        car2.PrintInfo();
        System.out.println("__________________________________________________");

        System.out.println("car2 short info");
        car2.printShortInfo();
        System.out.println("__________________________________________________");

        Person person2 = car2.getOwner();
        System.out.println("car2 info via getter: ");
        person2.printInfo();
        System.out.println("__________________________________________________");
    }
}
