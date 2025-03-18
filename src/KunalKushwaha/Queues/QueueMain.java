package KunalKushwaha.Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        //CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

//        System.out.println("top element : "+queue.front());
//        System.out.println(queue.remove());
//        queue.display();
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());


    }
}
