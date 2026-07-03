class Car {
    String brand;
    String model;
    int year;

    public void drive() {
        System.out.println("The " + brand + " " + model + " " + year + " " + "is moving" );
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

class Motorcycle extends Car {
    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void drive() {
        System.out.println("The bike " + brand + " " + model + " " + year + " " + "is moving" );
    }

    public void wheelie() {
        System.out.println("The " + brand + " " + model + " " + year + " " + "is wheeling" );
    }
}

public class OOP {
    public static void main(String[] args) {
        Car cerrojo = new Car("Cerrojo", "ax", 1998);
        cerrojo.drive();

        Motorcycle pollerita = new Motorcycle("Winner", "fair 110cc", 2006);
        pollerita.drive();
        pollerita.wheelie();
    } 
}