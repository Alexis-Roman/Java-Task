public class task13 {

    public static void main(String[] args) {

    }
}

class Vehicle{
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String make, String model, int year,
               int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

}

