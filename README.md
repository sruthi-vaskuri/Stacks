# Stacks


#### - The stack class in java is internally implemented using doubly linkedlists instead of arraylists.
#### - The performance of array based implementation of Stack is not up to the mark as resizing the capacity of array at run time is extensive and time consuming task. 
#### - To overcome this problem it is recommended to use Linked List for Stack implementation. This implementation creates a new node instance per addition, each storing supplied value and reference to following node. This links allow us to keep the stack intact and eventually traverse the entire collection. No additional memory requires as we creates a new node each time thus consume the space required per node.
