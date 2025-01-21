package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack implements Stack {
    /**
     * Tests if this stack is empty
     */

    // Création de la pile
    private List<Item> stack = new ArrayList<>();

    public SimpleStack () {
        this.stack = stack;
    }
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return 0;
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        stack.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}
