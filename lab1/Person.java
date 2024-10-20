package lab1;

public class Person {
    private String name;
    private String surname;
    private Date birthdate;

    public Person(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    public void printInfo() {
        System.out.printf("PersonInfo. Name: %s, Surname: %s%n ", name, surname);
        System.out.println("Person birthdate: ");
        birthdate.PrintInfo();
        System.out.println("________________");
    }

    @Override
    public String toString() {
        return "name=%s, surname=%s, date= %s".formatted(name, surname, birthdate.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}



