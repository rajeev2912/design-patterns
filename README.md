# Design Patterns
Provide implementation for various design patterns available in object oriented world.

## OO Basics
* Abstraction
* Polymorphism
* Inheritence
* Encapsulation

## OO Design Principles
* Encapsulate what varies
* Favor composition over inheritence
* Program to interfaces, not to implementations
* Open Closed prinicple: Classes should be open for extension, but closed for modification


## Strategy Pattern
* Defines a family of algorithms, encapsulate each one, and makes them interchangeable.
* Strategy pattern lets the algorithm vary independently from cliens that use it.

## Observer Pattern
* Defines one-to-many dependency between objects.
* When one object changes its state, all of its dependents are notified and updated automatically.
* Publisher + Subscribers = Observer Pattern, where publisher is a SUBJECT and subscriber is an OBSERVER

## Decorator Pattern
* Dynamically attaches additional responsibilities to an object.
* It provides a flexible alternative to subclassing for extending functionality

## Factory Pattern
* Defines an interface for creating objects, but lets subclass decide which class to instantiate
* Factory methods pattern encapsulate object creation by letting subclasses decide which objects to create
* Product classes vs Creator classes
* Create objects through inheritence. i.e. you need to extend a class and override a factory method

## Abstract Factory Pattern
* Provides an interface for creating families of related or dependent objects without specifying their concrete classes
* Create objects through composition

## Singleton Pattern
* Ensures a class has only one instance, and provides a global point of access to it.

