package Generics;

public class SortedList<T extends Comparable<T>> implements SortedListInterface<T> {

    private SortedList<T> list;

    public SortedList() {
        this.list = new SortedList<T>();
    }

    public void insert(T element) {
        this.list.insert(element);
    }

    public T remove(int index) {
        return this.list.remove(index);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public int size() {
        return this.list.size();
    }

    public T get(int index) {
        return this.list.get(index);
    }
}
