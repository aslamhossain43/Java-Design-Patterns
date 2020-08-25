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
1. Factory – Creates object without showing logic.
Example: Shape object creation, if pass "CIRCLE" then return Circle object,
if pass "SQUARE" then return Square object.
2. Abstract Factory – It is also called a factory of factories.
Example: Factories creation like shape, color etc.
3. Builder – Construct a complex object from simple objects using step-by-step approach. Example: When object can't be created in single step like in the de-serialization of a complex object. 
4. Singleton – Ensures that at most only one instance of an object exists throughout application.
Example: Saves memory because object is not created at each request. Only single instance is reused again and again.It used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.
5. Prototype Pattern - cloning of an existing object and can be customized if needed. Example: In game cloning object that reduces memory consume.

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
4. Visitor - Defines a new operation without introducing the modifications to an existing object structure.
5. State - A class behavior changes based on its state.
6. Strategy - A class behavior or its algorithm can be changed at run time.
7. Interpreter - Provides a way to evaluate language grammer or expression.
8. Iterator - Provides a way to access the elements of a collection without knowing it's underlying representation.
9. Reduces communication complexity between multiple objects or classes.
10. Memento - To restore the state of an object to its previous state.
Example: ctrl+z
11. Observer - In one-to-one dependency when one object changes state, all its dependents are notified and updated automatically.








## What are Some Design Patterns which are used in the JDK library?
1. The decorator pattern is used by Wrapper classes.
2. Singleton pattern is used by Calendar classes (Runtime).
3. The Wrapper classes use factory pattern like Integer.valueOf().
4. Event handling frameworks use observer pattern like swing, awt.






