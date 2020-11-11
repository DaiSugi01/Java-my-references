# TreeSet
TreeSet is almost the same as HashSet,  
However, TreeSet can have objects sorted by compareTo() method. (or you can use comparator to sort them.)
 
## To use TreeSet, the elements must be comparable
You must implement Comparable interface or create new Class implementing Comparator interface  
like when you sort an arrayList using Collections.sort().  

If you don't want to accept duplicated objects, you need to override hasCode(), equals() like HashSet do. 