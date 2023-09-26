import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueues
{
    //higher priority elements are served first than the low priority elements

    public static void main(String[] args)
    {
        Queue<Float> queue = new PriorityQueue<>();//gives in ascending order
        //Queue<Float> queue = new PriorityQueue<>(Collections.reverseOrder());  {gives in descending order}
        // in alphabetical order give the datatype as string

        queue.offer(3.9f);
        queue.offer(2.7f);
        queue.offer(4.0f);
        queue.offer(1.4f);
        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

    }
}
