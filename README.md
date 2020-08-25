# Java-Design-Patterns

## What is Design-Patterns ?
Design patterns are the best solutions to general problems that software developers faced during software development.

## Types of design patterns ?
1. Creational patterns - A way to create objects hiding new opreator.
Example: The Factory pattern is used in Wrapper classes like Integer.valueOf()

2. Structural patterns - Used to bring existing objects to form another structures which provide new functionality.
Example: The Adapter pattern in Java is the Arrays.asList().

3. Behavioral patterns - Used to abstract some kind of variation in behavior.
Example: The strategy pattern in Java is the Collections.sort(List<T>, Comparator<? super T>) method. The Comparator in this method is the strategy used to solve how the list will be sorted. Internally the list objects are communicating which is hidden.


## Creatioinal design patterns

### FAB SP(5)
1. Factory – Creates objects of several related classes without specifying the exact object to be created.
2. Abstract Factory – It is also called a factory of factories.
3. Builder – Constructs complex objects using step-by-step approach.
4. Singleton – Ensures that at most only one instance of an object exists throughout application.
5. Prototype Pattern - cloning of an existing object and can be customized if needed.

## Structural design patterns

### FAB FDCP(7)

1. Facade - Provides an interface hiding complexity of classes, library or framework.
2. Adapter - Bring existing objects to form another structures which provide new functionality. Arrays.asList().
3. Bridge - Decouple an abstraction from it's implimentation then they can vary independently.
4. Flyweight - Reuse existing similar kind of objects and create new object when no matching object is found.
5. Decorator - To add new functionality to an existing object without altering it's structure.
6. Composite - To use a group of objects as a single object.
7. Proxy - provides the control for accessing the original object.
Example - Credit/Master card.

## Behavioral design patterns

### CCTV SSIIMMO(11)

1. Chain of Responsibility - Allows to pass request to the chain of handlers until one of them handles request and decouple if sender and receiver based request. Exmaple: Exception handling.
2. Command - An object used to encapsulate all information needed to perform an action or trigger an event at a later time.
3. Template - provides a common sequence. So it defines a final method which tells the sequence of execution.








## What are Some Design Patterns which are used in the JDK library?
1. The decorator pattern is used by Wrapper classes.
2. Singleton pattern is used by Calendar classes (Runtime).
3. The Wrapper classes use factory pattern like Integer.valueOf().
4. Event handling frameworks use observer pattern like swing, awt.






