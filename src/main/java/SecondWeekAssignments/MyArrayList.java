package SecondWeekAssignments;

public class MyArrayList<E> {
    private Object[] data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }

    public void add(E element) {
        ensureCapacity();
        data[size++] = element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return (E) data[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
}

