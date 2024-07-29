package dev.aitor;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Person person1 = new Person("Pepe", "Cosmen", "3123-A", 2013, "Spain", 'M');
        Person person2 = new Person("David", "Goggins", "4156-B", 1983, "USA", 'M');

        System.out.println();
        person1.printAttributes();
        System.out.println();
        person2.printAttributes();
    }
}