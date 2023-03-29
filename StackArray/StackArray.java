/**
 * Implementation of a Stack ADT using an array, uses class StackNode.
 * Test class: StackArrayTest, Main class: StackArrayMain.
 * @version 1.1
 * @author dfrommont
 */

public class StackArray {

    private int pointer;
    private final StackNode[] array;

    /**
     * StackArray(int length) : Constructor for the StackArray class, takes a length for the array as a parameter.
     * @param length    the length of the array to be used for the Stack
     */

    public StackArray(int length) {
        pointer = 0;
        array = new StackNode[length];
    }

    /**
     * add(Object value) : adds a new StackNode to Stack, takes a value as a parameter.
     * @param value     the value of the StackNode to be added
     */

    public String add(Object value) {
        if (pointer == array.length) {
            return "Stack of length "+array.length+" is already full.";
        } else {
            array[pointer] = new StackNode(value);
            ++pointer;
            return null;
        }
    }

    /**
     * remove() : this removes the top StackNode in the stack, takes no parameters.
     * @return  StackNode   the returned StackNode from the top of the Stack
     */

    public StackNode remove() {
        if (pointer == 0) {
            System.out.println("Stack is empty, nothing to remove - null returned.");
            return null;
        } else {
            StackNode temp = array[pointer-1];
            array[pointer-1] = null;
            --pointer;
            return temp;
        }
    }

    /**
     * size() : returns the size of the populated region of the Stack's array (i.e. the size of the Stack), takes no parameters
     * @return  int     an integer equivalent to the number of items in the stack
     */

    public int size() {
        return pointer;
    }

    /**
     * peek(int i) : if i is a valid index in the Stack then this returns the value at that index, takes an integer as a parameter.
     * @param i     the index to be looked for in the Stack, must be 0<= i < n where n is the length of the stack
     * @return      the value at index i or an appropriate error message
     */

    public Object peek(int i) {
        if (i < array.length && i >= 0) {
            return array[i].getValue();
        } else {
            return ("Index "+i+" is out of bounds for the Stack");
        }
    }

    /**
     * contains(Object value) : returns true an StackNode's value in the Stack matches the value given as a parameter.
     * @param value     the value to be looked for
     * @return          true if a StackNode with the value is found and false if not
     */

    public boolean contains(Object value) {
        for (StackNode obj : array) {
            if (obj.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * display() : returns all the contents of the StackArray as a String, takes no parameter.
     * @return  String  the contents of the Stack.
     */

    public String display() {
        StringBuilder ret = new StringBuilder();
        for (StackNode obj : array) {
            if (obj == null) {
                ret.append("null").append(", ");
            } else {
                ret.append(obj.getValue()).append(", ");
            }
        }
        return ret.toString().trim();
    }
}
