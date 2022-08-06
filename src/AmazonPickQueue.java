import java.util.LinkedList;
import java.util.Queue;

public class AmazonPickQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        String p1 = "Vacuum", p2 = "Giant Bear", p3 = "3d Printer";
        q.add(p1);
        q.add(p2);
        q.add(p3);
        // Display contents of the queue.
        System.out.println("Packages in queue: " + q);
        // To remove the head of queue.
        String removed = q.remove();
        System.out.println("Removed package: " + removed);
        // Display contents of the queue.
        System.out.println("Packages in queue: " + q);
        // To view the head of queue
        String head = q.peek();
        System.out.println("Head of queue: " + head);
        // Size of queue
        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}