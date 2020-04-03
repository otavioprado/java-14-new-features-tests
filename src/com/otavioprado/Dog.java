package com.otavioprado;

public record Dog(String name, int age) implements Comparable<Dog> {

    public void bark() {
        System.out.println(name + " is barking...");
    }

    // overriding name's getter method
    public String name() {
        return name;
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }

    public static void main(String[] args) {
        var dog1 = new Dog("Spark", 4);
        System.out.println(dog1.toString()); // Dog[name=Spark, age=4]
        System.out.println("age=" + dog1.age());
        System.out.println("name=" + dog1.name());
    }
}
