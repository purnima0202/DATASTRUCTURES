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
    }
}
