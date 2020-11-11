# HashSet
HashSet can have unique values, which means it doesn't accept duplicated value. 

## How a HashSet checks for duplicates
HashSet uses hashcode value to determine whether accept adding it to HashSet or not. 
if its hashcode is different, it is regarded as a different object.
 
## Reference equality vs Object equality

- Reference equality  
    if the objects have the same reference, it is regarded as the same object.
    
- Object equality  
    if the objects have the same value, it is regarded as the same object.
 
## Override hasCode() and equals()
You must override hasCode() and equals(), To make sure the objects have the same value.  
