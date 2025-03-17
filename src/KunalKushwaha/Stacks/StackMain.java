package KunalKushwaha.Stacks;

public class StackMain {
    public static void main(String[] args) throws StackExceptionHandling {
        //Using the custom stack that we created before
        CustomStack stack = new CustomStack(5);
        stack.push(35);
        stack.push(20);
        stack.push(15);
        stack.push(13);
        stack.push(12);
        // stack.push(2); This will throw an error because it is not a dynamic stack the stack will be full

        //First in Last Out || Last In First Out
        System.out.println("peek : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
