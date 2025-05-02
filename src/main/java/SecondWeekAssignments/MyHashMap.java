package SecondWeekAssignments;

import java.util.LinkedList;

public class MyHashMap<K, V> {

    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16;
    private LinkedList<Node<K, V>>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update value
                return;
            }
        }

        bucket.add(new Node<>(key, value));
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Node<K, V>> bucket = buckets[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }


    public void printMap() {
        for (LinkedList<Node<K, V>> bucket : buckets) {
            for (Node<K, V> node : bucket) {
                System.out.println(node.key + " -> " + node.value);
            }
        }
    }


    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("apple", 2);
        map.put("banana", 5);
        map.put("apple", 3); // update value

        System.out.println("apple: " + map.get("apple"));   // 3
        System.out.println("banana: " + map.get("banana")); // 5
        System.out.println("orange: " + map.get("orange")); // null

        map.printMap();
    }
}

