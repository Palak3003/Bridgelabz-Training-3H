package Inheritance.Hybrid;
class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person implements Worker {
    String cuisineSpecialty;

    Chef(String name, int id, String cuisineSpecialty) {
        super(name, id);
        this.cuisineSpecialty = cuisineSpecialty;
    }

    public void performDuties() {
        System.out.println("Chef " + name + " (ID: " + id + ") is cooking " + cuisineSpecialty + " dishes.");
    }
}

class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " (ID: " + id + ") is serving " + tablesAssigned + " tables.");
    }
}

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Chef("Gordon", 101, "Italian");
        Worker w2 = new Waiter("Alice", 202, 5);

        w1.performDuties();
        w2.performDuties();
    }
}

