package Generics;

public class Swap<T> {
    private T first;
    private T second;

    public Swap(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void swap(){
        T trash = this.first;
        this.first = this.second;
        this.second = trash;
    }
}
