package com.atuka.stackimplementation;

public class StackMain {
    public static void main(String[] args) {
        //Accessing Stack
        Stack stack = new Stack();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

    }
}
