package KunalKushwaha.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(35);
        stack.push(20);
        stack.push(15);
        stack.push(13);
        stack.push(12);

        //First in Last Out || Last In First Out
        System.out.println("peek : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        //Deque usage
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println("Deque");
        deque.add(27);
        deque.addLast(60);
        deque.addFirst(13);
        System.out.println(deque.remove());//removes last element inserted
        System.out.println(deque.removeLast());
        System.out.println(deque.removeFirst());

    }
}
