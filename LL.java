package com.cambeeler;

public class LL {
    // First, the head is an object of type Elem whose value is an element of type Object.  The tail starts as the head...
    private Elem head = null;
    private Elem tail = null;
    private int size=0;

    public LL(){
    }

    public LL(Object item){
        this.head = new Elem(item);
        this.tail = head;
    }

    public boolean addItem(Object newItem) {
        if (this.head == null) {
            this.head = new Elem(newItem);
            size++;
            return true;
        }

        Elem traverse = head;
        Elem newObject = new Elem(newItem);

//  Walk the stack, compare the existing values in the stack with my value.  When I become larger in the compare, then insert.
//First, compare against the head value.
//  if greater than head, move to next and compare again
//  if less thna head, insert it to the left of head (ie, Create a new Elem object, set new Item to previous value of head,
// and set head to next value of new head...)
        // + newObject is greater than traverse (Increment traverse or add N.O. to end)
        // 0 newObject is equal to traverse (should never happen)
        // - newObject is less than traverse (then insert)
        while (traverse != null) {
            int result = newObject.compareTo(traverse);
            if (result < 0) { // if newObject is smaller than (-), then it gets inserted to the left.
                if (traverse.leftLink == null) {// when the newObject is smaller than the head it becomes the head
                    traverse.setPrevious(newObject);
                    newObject.setNext(traverse);
                    head = newObject;
                    size++;
                    return true;
                } else { //  NewObject is smaller than the links, but not at end...
                    traverse.previous().setNext(newObject);
                    newObject.setPrevious(traverse.previous());
                    traverse.setPrevious(newObject);
                    newObject.setNext(traverse);
                    size++;
                    return true;
                }
            } else if(result == 0){
                return false;
            }else if (traverse.rightLink == null){ // when the new object is at the rightmost of the list and still bigger...
                traverse.setNext(newObject);
                newObject.setPrevious(traverse);
                tail = newObject;
                size++;
                return true;
            }
        // if newObject is greater than, verify there is another rightmost, and move again.  If rightmost is null, then insert into the rightmost 'tail'.
            traverse = traverse.next();
        }
        return false;
    }

    public boolean removeItem(Object deadItem){
        Elem temp = head;

        while (temp!=null){
            if(temp.getValue().equals(deadItem)){
                if((temp.previous()==null)&&(temp.next()==null)){ // this means we are removing the last element from the list
                    // empty list
                    head = null;
                    tail = null;
                    size--;
                    return true;
                } else if (temp.previous()==null){ // this means that we are removing the head from the list
                    head = head.next();
                    head.setPrevious(null);
                    size--;
                    return true;
                } else if (temp.next()==null){ //   this means that we are removing the tail
                    temp.previous().setNext(null);
                    tail = temp.previous();
                    size--;
                    return true;
                }else{ // this means the removal is from the middle of the list...
                    temp.next().setPrevious(temp.previous());
                    temp.previous().setNext(temp.next());
                    size--;
                    return true;
                }

            }
            temp = temp.next();
        }
        return false;

    }

    public void printList(){
        if(head == null){
            System.out.println("There are no elements in this List");
            return;
        }
        Elem temp = head;
        int value=0;

        System.out.println("\nLinkedList Array");

        while(temp!=null){
            System.out.println("Value#" +(++value) + " = " + temp.getValue());

            temp = temp.next();
        }
        System.out.println("The Head is " + head.getValue() + ", the Tail is "+ tail.getValue() + ", and the Array size = " + size + "\n");
    }
}
