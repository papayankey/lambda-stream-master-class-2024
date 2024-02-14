package com.github.papayankey;

public class FunctionalInterface {
    public static void main(String[] args) {
        // Named class
        EnglishGreeter englishGreeter = new EnglishGreeter();
        englishGreeter.greet();

        // Anonymous class
        Greeter frenchGreeter = new Greeter() {
            @Override
            public void greet() {
                System.out.println("Bonjour");
            }
        };

        frenchGreeter.greet();

        // Lambda Expression
        Greeter spanishGreeter = () -> System.out.println("Hola");
        spanishGreeter.greet();
    }
}

@java.lang.FunctionalInterface
interface Greeter {
    void greet();
}

class EnglishGreeter implements Greeter {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
