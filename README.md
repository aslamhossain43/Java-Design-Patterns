# Java-Design-Patterns https://refactoring.guru/design-patterns/what-is-pattern

## What is Design-Patterns?
Design patterns are the best solutions to general problems that software developers face during software development. According to Gang Of Four, these are 23.

## Types of design patterns?
1. Creational patterns - The best way to create an object without showing a new operator.
Example: The Factory pattern is used in Wrapper classes - Integer i = Integer.valueOf(doubleValue);

2. Structural patterns - How classes and objects can be composed to form larger structures.
Example: The Adapter pattern in Java - List<String> list = Arrays.asList(arrayObj);

3. Behavioral patterns - Used to manage algorithms, relationships, and responsibilities between objects.
Example: The strategy pattern in Java is the Collections.sort(List<T>, Comparator<? super T>).


## Creational design patterns

### FAB SP(5)
1. Factory – Creates object without showing logic.
Example: The Wrapper classes use factory pattern like - Integer i = Integer.valueOf(doubleValue);
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

2. Abstract Factory – It is also called a factory of factories.
Example: Factories creation to access data from different data sources. Assume your application supports different data stores. (e.g. a SQL Database and an XML file, Text file).https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

3. Builder – Construct a complex object from simple objects using step-by-step approach. 
Example: When an object can't be created in a single step like  Locale locale = new Builder().setLanguage("sr").setScript("Latn").setRegion("RS").build();
 https://www.geeksforgeeks.org/builder-pattern-in-java/

4. Singleton – Ensures that at most only one instance of a class exists whole application.
Example: Saves memory because an object is not created at each request. Only a single instance is reused again and again. It is used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc. It is used by Calendar classes (Runtime). https://www.javatpoint.com/singleton-design-pattern-in-java

5. Prototype Pattern - Cloning of an existing object Example: Cloning object reduces memory consumption because more objects reference point to the same object. In the game, most of the starting data are same for every user. It is clonable for every user.
https://howtodoinjava.com/design-patterns/creational/prototype-design-pattern-in-java/

## Structural design patterns

### FAB FDCP(7)

1. Facade - Provides a simplified interface to a complex subsystem. Example: https://refactoring.guru/design-patterns/facade

2. Adapter or Wrapper - Allows incompatible interfaces to work together. Example: https://refactoring.guru/design-patterns/adapter

3. Bridge - Decouple an abstraction from its implementation so that the two can be changed independently. Example: In remote control device, Abstraction: remote and Implementation: device https://refactoring.guru/design-patterns/bridge

5. Flyweight or Cache - To save RAM share(reuse) the common parts of the state between multiple objects instead of keeping all of the data in each object. Example: https://refactoring.guru/design-patterns/flyweight

6. Decorator or Wrapper - To add new functionality to an existing object without altering its structure. https://www.javatpoint.com/decorator-pattern, https://refactoring.guru/design-patterns/decorator

7. Composite or Object Tree - A group of objects that form a tree(hierarchy, menu) and are treated as a same type single object. Cashier, accountant these are under the bank manager. https://www.javatpoint.com/composite-pattern

8. Proxy - Provides the control for accessing the original object. Example - Credit/Master card, Security to block site.https://refactoring.guru/design-patterns/proxy

## Behavioral design patterns

### CCTV SSIIMMO(11)

1. Chain of Responsibility or CoR or Chain of Command - Allows to pass a request to the chain of handlers until one of them handles the request and decouples the request. Examples: In exception handling catch block. https://www.geeksforgeeks.org/chain-responsibility-design-pattern/

2. Command or Action or Transaction - To abstract business logic into discrete actions. Example: Remote. https://www.geeksforgeeks.org/command-pattern/

3. Template - A secuence of steps of an algorithm.The subclasses are allowed to override the steps but not allowed to change the steps.
Example : https://howtodoinjava.com/design-patterns/behavioral/template-method-pattern/, https://www.tutorialspoint.com/design_pattern/template_pattern.htm  - Game initialize(); startPlay(); endPlay();
Benefit : To reuse the codes.

4. Visitor - Allows adding new behaviors to existing class hierarchy without altering any existing code. Adding router configuration for windows  https://howtodoinjava.com/design-patterns/behavioral/visitor-design-pattern-example-tutorial/

5. State - Allows an object to change its behavior when the internal state of that object changes.Example : https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/, https://dzone.com/articles/state-design-pattern-in-java  -  TV on/of, Start stop state.

6. Strategy - A class's algorithm can be changed at run time.
Example: Collections.sort(List<T>, Comparator<? super T>) method. https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm

7. Interpreter - Is used to defines a grammatical representation for a language and provides an interpreter to deal with this grammar. Example: java.util.Pattern, java.text.Format, java compiler, google translator, https://www.journaldev.com/1635/interpreter-design-pattern-java

8. Iterator - Provides a way to access the elements of an aggregate object sequentially without exposing its underlying implementation.Example: Iterator, https://www.javatpoint.com/iterator-pattern

9. Mediator - Reduces communication complexity between multiple objects or classes.https://www.javatpoint.com/mediator-pattern - Chat

10. Memento - To restore the state of an object to its previous state.Example: ctrl+z, https://howtodoinjava.com/design-patterns/behavioral/memento-design-pattern/

11. Observer - In one-to-one dependency when one object changes state, all its dependents are notified and updated automatically.
Example: One-to-one, one-to-many etc, Event handling frameworks like swing, awt. https://howtodoinjava.com/design-patterns/behavioral/observer-design-pattern/




## Is it possible to create a clone of a singleton object?
Yes, it is possible to create a clone of a singleton object.



## What are Some Design Patterns which are used in the JDK library?
1. The decorator pattern is used by Wrapper classes.
2. Singleton pattern is used by Calendar classes (Runtime).
3. The Wrapper classes use factory pattern like Integer.valueOf().
4. Event handling frameworks use observer pattern like swing, awt.


# Tutorials:
https://www.jobsity.com/blog/a-deep-dive-into-9-popular-design-patterns-and-their-uses


