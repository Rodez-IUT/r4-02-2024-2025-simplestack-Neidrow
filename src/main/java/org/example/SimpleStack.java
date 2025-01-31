package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleStack implements Stack {
    /**
     * Tests if this stack is empty
     */

    // Création de la pile
    private final List<Item> stack;

    public SimpleStack () {

        this.stack = new ArrayList<>();
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
        return stack.size();
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
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size()-1);

    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(stack.size()-1);
    }
}
