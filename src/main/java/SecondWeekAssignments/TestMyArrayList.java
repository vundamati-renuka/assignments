package SecondWeekAssignments;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Item " + i + ": " + list.get(i));
        }

        System.out.println("Total items: " + list.size());
    }
}

