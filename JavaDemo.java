// Main class that demonstrates multiple concepts in Java
public class JavaDemo {
    // Field hiding demonstration
    public String name = "Outer Class";

    // Nested (inner) class example
    class InnerClass {
        // Inner class field hiding the outer class field
        public String name = "Inner Class";

        // Method demonstrating field hiding, 'this', and 'super'
        public void printNames() {
            System.out.println("Inner class name: " + this.name); // Refers to InnerClass's field
            System.out.println("Outer class name: " + JavaDemo.this.name); // Refers to JavaDemo's field
        }
    }

    // Static nested class example (acts like an independent class)
    static class StaticNestedClass {
        public void printMessage() {
            System.out.println("Message from static nested class.");
        }
    }

    // Abstract class example
    abstract class Animal {
        // Abstract method (must be implemented by subclasses)
        public abstract void sound();

        // Non-abstract method (can be overridden)
        public void eat() {
            System.out.println("This animal is eating.");
        }
    }

    // Final class example (cannot be extended)
    final class Dog extends Animal {
        // Overriding abstract method from Animal class
        @Override
        public void sound() {
            System.out.println("Dog barks.");
        }

        // Overriding eat method
        @Override
        public void eat() {
            System.out.println("Dog is eating.");
        }

        // Final method (cannot be overridden)
        public final void sleep() {
            System.out.println("Dog is sleeping.");
        }
    }

    // Polymorphism demonstration
    public void polymorphismExample(Animal animal) {
        animal.sound(); // Method resolved at runtime (polymorphism)
        animal.eat(); // This could call an overridden method
    }

    // Demonstration of method hiding
    static class Parent {
        public static void staticMethod() {
            System.out.println("Static method in Parent class.");
        }

        public void instanceMethod() {
            System.out.println("Instance method in Parent class.");
        }
    }

    // Child class hiding parent's static method
    static class Child extends Parent {
        // Hiding static method (not overriding since static methods are class-level)
        public static void staticMethod() {
            System.out.println("Static method in Child class.");
        }

        // Overriding instance method
        @Override
        public void instanceMethod() {
            System.out.println("Instance method in Child class.");
        }
    }

    // Anonymous class example
    public void anonymousClassExample() {
        Animal cat = new Animal() {
            // Providing implementation for the abstract method
            @Override
            public void sound() {
                System.out.println("Cat meows.");
            }
        };
        cat.sound();
    }

    public static void main(String[] args) {
        JavaDemo demo = new JavaDemo();

        // Inner class demonstration
        JavaDemo.InnerClass inner = demo.new InnerClass();
        inner.printNames();

        // Static nested class demonstration
        JavaDemo.StaticNestedClass staticNested = new JavaDemo.StaticNestedClass();
        staticNested.printMessage();

        // Abstract class and method overriding example
        Animal dog = demo.new Dog();
        demo.polymorphismExample(dog);

        // Final method cannot be overridden, but can be called
        Dog finalDog = demo.new Dog();
        finalDog.sleep();

        // Method hiding example
        Parent parent = new Parent();
        Parent childAsParent = new Child();

        parent.staticMethod(); // Calls Parent's static method
        childAsParent.staticMethod(); // Calls Parent's static method (method hiding)
        childAsParent.instanceMethod(); // Calls Child's instance method (overriding)

        // Anonymous class demonstration
        demo.anonymousClassExample();
    }
}
