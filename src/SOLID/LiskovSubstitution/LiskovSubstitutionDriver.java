package SOLID.LiskovSubstitution;

public class LiskovSubstitutionDriver {
    public static void main(String[] args) {
        NonFlight ostrich = new Ostrich("Ostrich1");
        ostrich.eat();

        FlightBird crow = new Crow("Crow1");
        crow.fly();

    }
}
