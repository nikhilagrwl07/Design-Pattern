package SOLID.LiskovSubstitution;

class Bird {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is Eating");
    }
}

class FlightBird extends Bird {

    public FlightBird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(name + " is Flying");
    }
}

class NonFlight extends Bird {
    public NonFlight(String name) {
        super(name);
    }
}

class Crow extends FlightBird {
    public Crow(String name) {
        super(name);
    }
}

class Ostrich extends NonFlight {
    public Ostrich(String name) {
        super(name);
    }
}


