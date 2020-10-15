
import java.util.*;

public class PizzaQueue {
    private String[] date;
    private int size;
/**
 * Constructor
 */
    public PizzaQueue() {
        this.date = new String[20];
        this.size = 0;
    }
/**
 * Lets user know if Queue is empty or not.
 */
    public boolean empty() {
        return this.size == 0;
    }
/**
 * Lets user see the first element of the Queue.
 */
    public String peek() {
        return this.date[0];
    }
/**
 * Lets user add an element to the Queue.
 */
    public void push(String dateOrdered) {

        if (size < 20) {
            date[size] = dateOrdered;
            size++;
         } else {
            System.out.println("Sorry we are at capacity try ordering again later");
         }

    }
/**
 * Lets user take out the first element of the Queue.
 */
    public String pop() {
        String firstOrder;
        if (date[0] == null) {
            return null;
        } else {
            firstOrder = date[0];
            size--;
            for (int i = 1; i < date.length; i++) {
                date[i - 1] = date[i];
            }
        }
        return firstOrder;

    }
/**
 * Lets user know the size of Queue.
 */
    public int getSize() {
        return this.size;
    }
/**
 * Lets user see the first element of the Queue.
 */
    @Override
    public String toString() {
        return peek();
    }
}