# ArrayList
Resizable-array implementation of the List interface.

## How does its capacity increase?
When the element is added, ArrayList grows its capacity multiplying factor 1.5.  
For instance, if you add an element to the ArrayList which has 10 elements,  
then the ArrayList is expanded 10 >> 1 which is 5.  
As a result, the total size of ArrayList will be *15*.

## Declaration of ArrayList
```java
ArrayList<T> foo = new ArrayList<>();
```

### ArrayList vs List
List is an interface, and ArrayList is a class implementing List.  
You can declare ArrayList as List.
```java
List<T> foo = new ArrayList<>();
```
This has an advantage of having extensibility.
If you know you do not use ArrayList's method, then you can use List type. 
