package KunalKushwaha.Stacks;

public class DynamicMain {
    public static void main(String[] args) throws StackExceptionHandling {
        //Using the custom stack that we created before
        DynamicStack stack = new DynamicStack(5);

        // CustomStack stack = new DynamicStack(5);
        stack.push(35);
        stack.push(20);
        stack.push(15);
        stack.push(13);
        stack.push(10);
        stack.push(3);


        //First in Last Out || Last In First Out
        System.out.println("peek : "+stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
