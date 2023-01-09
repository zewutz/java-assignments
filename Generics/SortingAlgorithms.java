package Generics;

import java.util.LinkedList;

public class SortingAlgorithms<T> implements SortingAlgInterface<T> {

    private LinkedList<Integer> list = new LinkedList<>();

    @Override
    public int BubbleSort(T list) {
        int f_el = 0;
        int s_el = 0;


        System.out.println(list);


        Swap<Integer> swap = new Swap<>(f_el, s_el);
        for (int i = 0; i < 8; ++i) {
            System.out.println(i);
            if (this.list.get(i) > this.list.get(i++)) {
                f_el = this.list.get(i);
                s_el = this.list.get(i++);
                System.out.println(i);

                this.list.add(i, f_el);

                System.out.println(f_el + " " + s_el);
            }
        }
        System.out.println("final: " + list);
        return 0;
    }

    @Override
    public int TestBubbleSort() {
        this.list.push(3);
        this.list.push(2);
        this.list.push(4);
        this.list.push(2);
        this.list.push(6);
        this.list.push(16);
        this.list.push(12);

        System.out.println(this.list);

        return this.BubbleSort((T) this.list);
    }

}
