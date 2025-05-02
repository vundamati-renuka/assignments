package SecondWeekAssignments;

public class MyTreeSet<E extends Comparable<E>> {

    private class Node {
        E data;
        Node left, right;

        Node(E data) {
            this.data = data;
        }
    }

    private Node root;


    public void add(E element) {
        root = addRecursive(root, element);
    }

    private Node addRecursive(Node current, E element) {
        if (current == null) {
            return new Node(element);
        }

        int cmp = element.compareTo(current.data);
        if (cmp < 0) {
            current.left = addRecursive(current.left, element);
        } else if (cmp > 0) {
            current.right = addRecursive(current.right, element);
        }
        // If element is equal, do nothing (no duplicates)
        return current;
    }


    public boolean contains(E element) {
        return containsRecursive(root, element);
    }

    private boolean containsRecursive(Node current, E element) {
        if (current == null) {
            return false;
        }

        int cmp = element.compareTo(current.data);
        if (cmp == 0) {
            return true;
        } else if (cmp < 0) {
            return containsRecursive(current.left, element);
        } else {
            return containsRecursive(current.right, element);
        }
    }

    public void printInOrder() {
        printInOrderRecursive(root);
        System.out.println();
    }

    private void printInOrderRecursive(Node current) {
        if (current != null) {
            printInOrderRecursive(current.left);
            System.out.print(current.data + " ");
            printInOrderRecursive(current.right);
        }
    }


    public static void main(String[] args) {
        MyTreeSet<String> treeSet = new MyTreeSet<>();

        treeSet.add("banana");
        treeSet.add("apple");
        treeSet.add("mango");
        treeSet.add("grape");
        treeSet.add("banana");

        System.out.println("Tree contains 'apple': " + treeSet.contains("apple"));  // true
        System.out.println("Tree contains 'orange': " + treeSet.contains("orange")); // false

        System.out.print("Sorted elements: ");
        treeSet.printInOrder();
    }
}
