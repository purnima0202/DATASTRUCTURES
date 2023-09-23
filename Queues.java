import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("selena");
       // System.out.println(queue.peek);{sees the first element without removing it}
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();// does not give any error even the poll method is used a number of times like stack
       // queue.element(); element is used to peek and it will show an exception
        System.out.println(queue);
        System.out.println(queue);
        System.out.println(queue.isEmpty());//to check if the queue is empty
        System.out.println(queue.size());//to check the size of the queue
        System.out.println(queue.contains("Karen"));//does it contain  the particular element or not
    }
}
    

