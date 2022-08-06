import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue q = new Queue();
        String fn, ln;
        int a;

        System.out.println("\nWelcome to the line!");
        for (int i = 0 ; i < 5 ; i++) {
            System.out.print("Enter the first name of person " + (i+1) + ": ");
            fn = scan.nextLine();
            System.out.print("Enter the last name of person " + (i+1) + ": ");
            ln = scan.nextLine();
            System.out.print("Enter the age of person " + (i+1) + ": ");
            a = scan.nextInt();
            scan.nextLine();
            Person p = new Person(fn,ln,a);
            q.addQueue(p);
        }
        scan.close();

        System.out.println("\nEntered Queue:");
        q.printQueue();
        System.out.println("\nDescending Quicksort of the Queue by last name:");
        q.sortLast();
        q.printQueue();
        System.out.println("\nDescending Quicksort of the Queue by age:");
        q.sortAge();
        q.printQueue();

        System.out.println("\nOkay " + q.getFront() + ", come with me.");
        q.remQueue();
        System.out.println("Alright " + q.getFront() + ", you're next.");
        q.remQueue();
        System.out.println("Oh no, how many do we have left?");
        q.printQueue();
        System.out.println("Sorry everyone, we're closed!");
        q.clear();
        System.out.println("Did everyone leave? (to test exception message)");
        q.getFront();
    }
}
