# OOD-study-log

## Design Pattern Implementation Documents
### Brief Project Summary
My project catalogs Six Patterns: Strategy Pattern, Decorator Pattern, Observer Pattern, Command Pattern, Adapter Pattern, and Façade Pattern. I choose to different application to each explain each pattern. The coding software is IntelliJ.

### Strategy pattern: behavioral Pattern

#### Explanation of problem and solution

At the begging, I want to write a program to plan travel for travelers.  The Destination and the transportation are the first thing I need to consider about.  Thus I write an abstract class called “traveler” which has the functions for setting destination and transportation so that different traveler could inherit this class. 

However, I found different traveler has different destination. If I have 10 travel, 5 of them want to go 2 different destinations, I have to override that function 5 at least five times. So I need a solution which could make the destination interchangeable. I figured out Strategy Pattern: Using if in the situation that one problem is able to be solved by multiple similar algorithms. Here is my solution: I take the destination function out of Traveler class, and the strategy of each destination implemented destination interface are packaged into a single class and replaced arbitrarily when context(traveler) change.

Meanwhile, the transportation and the choices of partner have same problem with Destination. To be specific, Travelers may choose different transportation to go destination and they may want family members or friends to go travel with, even travel alone. Thus, same idea also be implemented in Transportation interface and Partner interface.
 
#### Project folder that contains the code 

List of Java file for Strategy pattern: 

(strategy)Transportation interface.java, train.java, plane.java, car.java
(strategy)Destination interface.java, Japan. Java, NewYork.java,
(strategy)Partner interface.java, Alone.java, WithFamily.java, 
(context)Traveler abstract class.java, Peter.java, Mary.java
(main function) strategydemo.java

#### Implementation document and explanation

Run strategydemo.java document:

Traveler Peter will go travel alone and take airplane, the destination is Japan.
Traveler Mary will go travel with family member by driving car, the destination is New York.
Traveler Peter also go travel to New York and this time, he goes with his family by train.
 
 

 

### Observer pattern：behavioral Pattern

#### Explanation of problem and solution

We get some information about some subject, I want to broadcast to every Observer followed me.  I just use Observer and Subject to be the class name. I thought it is easier to catch the point.
Wrong code:
```
public class BadObserver {
        public void getchanged() {
            info1 = getInfo1();
            info2 = getInfo2();
Observer1.update(info1, info2);
Observer1.display(info1, info2);
Observer2.update(info1, info2): data1;
Observer2.display(data1);
Observer3.update(info1, info2): data2;
Observer3.display(data2);	
}
```
This code just finished the basic function, which is Notify Observer once subject get check. However, if we write code in this way, we cannot add observer when program start running. And One class has not only one responsibility, violating single responsibility principle.
they all have an update() method takes the info1 and info,  too much needless repetitions appears. To solve the problem, we could separate informer and observer and encapsulate what changes to make code easier to change. Also, allowing multiple Observers and Subject, notifying all observers when subject get changes, that functions reduce the dependent relationship and connect them for as long as needed.

#### Project folder that contains the code

List of Java file for Observer pattern: 
(Subject)Subject interface.java, subject1.java
(Observer)Observer interface.java, Observer1.java, Observer2.java, Observer3.java
(main function) ObserverDemo.java

#### Implementation document and explanation

Run ObserverDemo.java document:
Subject1 will be create and Observer1, Observer 2 and Observer 3 add themselves to Subject ArrayList. Once Subject1 set a change, it will notify all Observer in the Observer ArrayList.  Each Observer will receive the update information and print it in their own way.
 
