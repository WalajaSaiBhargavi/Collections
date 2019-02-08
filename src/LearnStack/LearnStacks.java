package LearnStack;

import java.util.Stack;

public class LearnStacks {
    //Stack Extends Vector class which implements List
    //Stack has 5 methods --> push, pop, peek, empty, search all these operations take O(1) time complexity
    Stack<Integer> stack = new Stack<>();
    public void stack_push(){
        for (int i = 0; i < 100; i++) {
            System.out.println(stack.push(i));// push returns the argument added.
        }
    }

    public void stack_pop(){
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }

    public void stack_search(int i){
        System.out.println(stack.search(i));// returns -1 if the stack has no element
    }

    public void stack_peek(){
        System.out.println(stack.peek());
        //peek and pop will return emptystackexception when applied on empty stack
    }

    public void stack_empty(){
        System.out.println(stack.empty());
    }

    public static void main(String[] args) {
        LearnStacks l = new LearnStacks();
        l.stack_push();

    }
}
