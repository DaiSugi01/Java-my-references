# [Comparable](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html) & [Comparator](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html) 
Both Comparable and Comparator is used for sorting array list.
Both return negative value, positive value, or 0

## When they are used
- *Comparable* is used when you want to sort with particular one key.  
- It's good time to use *Comparator* when you want to have several difference sort keys in your application.

## How to use
### Comparable
1. Make the class you want to sort implement Comparable interface.
2. Override compareTo() method.
3. Implements compareTo() method.  
    
### Comparator
1. Create new class.
2. Create inner class implementing Comparator interface in the new class.
3. Override compare() method.
4. Implements compare() method.
