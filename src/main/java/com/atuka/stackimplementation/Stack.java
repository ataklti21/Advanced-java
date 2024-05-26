package com.atuka.stackimplementation;

public class Stack {
    public StackItem top;

    public Stack() {
        //referencing to null
        top = null;
    }

    //Pushing value to the stack
    public void push(int x) {
        StackItem newItem = new StackItem(x);
        newItem.next = top;
        top = newItem;
    }
//Check if stack is empty
    public boolean empty() {
        return top == null;
    }

    public int peek() {
        return top.value;
    }

    public void pop() {
        top = top.next;
    }
}
