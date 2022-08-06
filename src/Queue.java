import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/**
 * Queue class for Person objects.
 */
public class Queue implements QueueInterface<Person> {
    private final ArrayList<Person> people;

    /**
     * Default Constructor
     */
    public Queue( ) {
        this.people = new ArrayList<>();
    }

    /**
     * Quicksort Recursively sort by age.
     * @param people Person Queue
     * @param min Default is 0
     * @param max Length of Collection
     */
    void quickSortAge(ArrayList<Person> people , int min , int max){
        if (min < max) {
            int index = agePartition(people, min, max);
            quickSortAge(people, min, index - 1);
            quickSortAge(people, index + 1, max);
        }
    }

    /**
     * Quicksort Partition Algorithm for age (int values).
     * @param people Person Queue
     * @param min Default is 0
     * @param max Length of Collection
     * @return Index of next Person
     */
    int agePartition(ArrayList<Person> people , int min , int max) {
        int pivot = people.get(max).getAge(); //pivot
        int i = (min - 1);
        for (int j = min ; j < max ; j++) {
            if (people.get(j).getAge() > pivot) { //check
                i++;
                Person temp = people.get(i);
                people.set(i , people.get(j)); //swap
                people.set(j , temp);
            }
        }
        Person temp = people.get(i + 1);
        people.set(i + 1 , people.get(max)); //swap
        people.set(max , temp);
        return i + 1;
    }
    /**
     * Quicksort Recursively sort by last name.
     * @param people Person Queue
     * @param min Default is 0
     * @param max Length of Collection
     */
    void quickSortLast(ArrayList<Person> people , int min , int max){
        if (min < max) {
            int index = lastPartition(people, min, max);
            quickSortLast(people, min, index - 1);
            quickSortLast(people, index + 1, max);
        }
    }
    /**
     * Quicksort Partition Algorithm for last name (String values).
     * @param people Person Queue
     * @param min Default is 0
     * @param max Length of Collection
     * @return Index of next Person
     */
    int lastPartition(ArrayList<Person> people , int min , int max) {
        String pivot = people.get(max).getLastName();
        int i = (min - 1);
        for (int j = min ; j < max ; j++) {
            if (people.get(j).getLastName().compareTo(pivot) > 0) {
                i++;
                Person temp = people.get(i);
                people.set(i , people.get(j));
                people.set(j , temp);
            }
        }
        Person temp = people.get(i + 1);
        people.set(i + 1 , people.get(max));
        people.set(max , temp);
        return i + 1;
    }

    @Override
    public void addQueue(Person e) throws IllegalStateException {
        System.out.println("Added to the queue: " + e);
        people.add(e);
    }

    @Override
    public Person getFront( ) {
        if (isEmpty()) throw new NoSuchElementException();
        else return people.get(0);
    }

    @Override
    public Person remQueue( ) throws NoSuchElementException {
        Person e = people.get(0);
        people.remove(0);
        System.out.println("Removed from queue: " + e);
        return e;
    }

    @Override
    public boolean isEmpty( ) {
        return people.isEmpty();
    }

    @Override
    public int size( ) {
        return people.size();
    }

    @Override
    public void clear( ) {
        while (!isEmpty()) remQueue();
    }

    /**
     * Sort Queue by last name.
     */
    void sortLast() {
        quickSortLast(people, 0, people.size() - 1);
    }

    /**
     * Sort Queue by age.
     */
    void sortAge() {
        quickSortAge(people, 0, people.size() - 1);
    }

    /**
     * Prints the Queue
     */
    public void printQueue( ) {
        for (Person person: people) {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " - Age: " + person.getAge());
        }
    }
}
