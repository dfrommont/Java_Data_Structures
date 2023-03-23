/**
 * Implementation of Stack ADT using Doubly Linked Lists, inherits mostly from DoublyLinkedList class.
 * Test class: , Main class: StackListMain.
 * @version 1.0
 * @author dfrommont
 */

public class StackList extends DoublyLinkedList{

    public StackList() {
    }

    //add
    //remove
    //peek
    //size
    //contains
    //display

    //all the methods needed are in DoublyLinkedList

    public DoubleNode peek(int i) {
        if (i >= 0 &&  i < size()) {
            DoubleNode current = head();
            for (int j = 0; j < i; j++) current = current.getNext();
            return current;
        }
        return null;
    }

}

