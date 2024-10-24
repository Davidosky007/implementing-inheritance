
---

# Java Nested Classes, Access Modifiers, and Polymorphism Demonstration

This project is a Java program that demonstrates various Object-Oriented Programming (OOP) concepts, such as **nested classes**, **access modifiers**, **anonymous classes**, **method overriding**, **method hiding**, **field hiding**, **polymorphism**, and the use of the `super` and `this` keywords. It also includes examples of **final classes and methods**, as well as **abstract classes and methods**. The program is fully commented and structured to help new learners understand these key Java concepts.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Code Explanation](#code-explanation)
  - [Nested Classes](#nested-classes)
  - [Access Modifiers](#access-modifiers)
  - [Anonymous Classes](#anonymous-classes)
  - [Method Overriding & Hiding](#method-overriding--hiding)
  - [Field Hiding](#field-hiding)
  - [Polymorphism](#polymorphism)
  - [Keywords `this` and `super`](#keywords-this-and-super)
  - [Final Classes & Methods](#final-classes--methods)
  - [Abstract Classes & Methods](#abstract-classes--methods)
- [Contributing](#contributing)
- [License](#license)

## Overview

This program is designed to provide a comprehensive demonstration of key OOP concepts in Java. By going through the code, you'll see practical examples of:
- Nested classes, both inner and static.
- Different types of access modifiers.
- Method hiding and overriding.
- The use of the `super` and `this` keywords.
- The final keyword applied to classes and methods.
- Polymorphism through abstract classes and methods.
- Anonymous classes.

## Features

- Demonstrates **inner** and **static nested** classes.
- Illustrates **field hiding** between nested classes.
- Shows **method overriding** and **method hiding**.
- Explains the use of the `this` and `super` keywords.
- Includes examples of **final classes** and **final methods**.
- Demonstrates **abstract classes** and **abstract methods**.
- Implements **polymorphism** through method overriding.
- Provides an example of **anonymous classes**.
  
## Installation

To run this Java program, ensure you have the Java Development Kit (JDK) installed on your machine. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Steps:

1. **Clone the repository** or download the `.java` file.

    ```bash
    git clone <repository-url>
    ```

2. **Navigate** to the directory containing the Java file.

3. **Compile** the Java file using the `javac` command:

    ```bash
    javac JavaDemo.java
    ```

4. **Run** the compiled program:

    ```bash
    java JavaDemo
    ```

## Usage

Once you run the program, it will execute the different demonstrations of the concepts covered. Each section of the code focuses on a specific OOP concept, and the output printed in the console will explain how each concept works.

### Example Output:

The program will display something like the following:

```plaintext
Inner class name: Inner Class
Outer class name: Outer Class
Message from static nested class.
Dog barks.
Dog is eating.
Dog is sleeping.
Static method in Parent class.
Static method in Parent class.
Instance method in Child class.
Cat meows.
```

## Code Explanation

### Nested Classes

There are two types of nested classes used:
- **Inner Class**: A non-static nested class that has access to the outer class's fields and methods.
- **Static Nested Class**: A static class nested inside the main class but does not have access to the outer class's instance fields or methods.

#### Example:
```java
class InnerClass {
    public String name = "Inner Class";
}
```

### Access Modifiers

Access modifiers define the scope and visibility of classes, fields, and methods. The common ones used here are:
- `public`: Accessible from anywhere.
- `private`: Accessible only within the same class.

### Anonymous Classes

An **anonymous class** is an implementation of an abstract class or an interface without needing to explicitly declare a subclass. This is demonstrated in the program by creating an anonymous class based on the `Animal` abstract class.

#### Example:
```java
Animal cat = new Animal() {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
};
```

### Method Overriding & Hiding

- **Overriding**: When a subclass provides its own implementation of a method defined in a parent class.
- **Method Hiding**: Happens when a static method in a subclass has the same signature as one in its parent class.

#### Example:
```java
@Override
public void instanceMethod() {
    System.out.println("Instance method in Child class.");
}
```

### Field Hiding

Field hiding occurs when a field in a nested class has the same name as a field in its outer class. The `this` keyword is used to reference the current class's field, while `OuterClass.this` is used to reference the outer class's field.

#### Example:
```java
System.out.println("Outer class name: " + JavaDemo.this.name);
```

### Polymorphism

Polymorphism allows a single method to operate on different types of objects. In the example, the method `polymorphismExample()` takes an `Animal` object, but it can operate on any subclass of `Animal`, such as `Dog`.

#### Example:
```java
public void polymorphismExample(Animal animal) {
    animal.sound(); // Resolved at runtime
}
```

### Keywords `this` and `super`

- `this`: Refers to the current object instance.
- `super`: Refers to the parent class and is used to access the parent class's methods and fields.

### Final Classes & Methods

- **Final Class**: A class declared as `final` cannot be subclassed.
- **Final Method**: A method declared as `final` cannot be overridden.

#### Example:
```java
public final void sleep() {
    System.out.println("Dog is sleeping.");
}
```

### Abstract Classes & Methods

- **Abstract Class**: A class that cannot be instantiated and must be subclassed.
- **Abstract Method**: A method without a body, which must be implemented by subclasses.

#### Example:
```java
abstract class Animal {
    public abstract void sound(); // Abstract method
}
```

## Contributing

Feel free to fork this repository and submit pull requests if you want to contribute or improve the program. All contributions are welcome!

## License

This project is licensed under the MIT License. See the LICENSE file for details.

---
