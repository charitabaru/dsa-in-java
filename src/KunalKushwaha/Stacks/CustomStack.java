package KunalKushwaha.Stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    public int pop() throws StackExceptionHandling{
        if (isEmpty()){
            throw new StackExceptionHandling("can not pop up from empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int peek() throws StackExceptionHandling{
        if (isEmpty()){
            throw new StackExceptionHandling("can not pop up from empty stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length -1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
