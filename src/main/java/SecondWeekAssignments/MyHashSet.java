package SecondWeekAssignments;

import java.util.LinkedList;

public class MyHashSet<E> {

    private final int SIZE = 16;
    private LinkedList<E>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    private int getBucketIndex(E element) {
        return Math.abs(element.hashCode() % SIZE);
    }


    public void add(E element) {
        int index = getBucketIndex(element);
        LinkedList<E> bucket = buckets[index];

        if (!bucket.contains(element)) {
            bucket.add(element);
        }
    }


    public boolean contains(E element) {
        int index = getBucketIndex(element);
        return buckets[index].contains(element);
    }


    public void printSet() {
        for (LinkedList<E> bucket : buckets) {
            for (E element : bucket) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MyHashSet<String> set = new MyHashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple");

        System.out.println("Contains 'banana'? " + set.contains("banana")); // true
        System.out.println("Contains 'orange'? " + set.contains("orange")); // false

        System.out.print("HashSet elements: ");
        set.printSet();
    }
}

