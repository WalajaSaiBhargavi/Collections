package LearnStack;

import java.util.Stack;

public class PracticeStack {
    static String input = "{[(]}";
    Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) {
        PracticeStack s = new PracticeStack();
        System.out.println(s.getValue());
    }
    private boolean getValue(){
        boolean value = true;
        for(char c : input.toCharArray()) {
            if (c == '{' || c == '['||c == '(' )
                stack.push(c);
            if (c == ']' && stack.pop() != '[')
                value = false;
            if (c == '}' && stack.pop() != '[')
                value = false;
            if (c == ')' && stack.pop() != '[')
                value = false;
        }
        if(stack.empty()){
            value = true;
        }
        return value;
    }
}
