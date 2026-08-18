class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Interfaces for Multiple Inheritance
interface Sports {
    void sport();
}

interface Music {
    void music();
}

// Multiple + Hybrid Inheritance
class Student implements Sports, Music {
    public void sport() {
        System.out.println("Student plays sports");
    }

    public void music() {
        System.out.println("Student sings");
    }
}

// Hybrid Inheritance
class CollegeStudent extends Student {
    void study() {
        System.out.println("College student studies");
    }
}

public class AllInheritance {
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple + Hybrid Inheritance
        CollegeStudent s = new CollegeStudent();
        s.sport();
        s.music();
        s.study();
    }
}