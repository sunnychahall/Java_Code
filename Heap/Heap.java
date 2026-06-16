import java.util.*;

public class heap {

    List<Integer> heap = new ArrayList<>();

    public void insert(int data) {
        heap.add(data);

        int x = heap.size() - 1;
        int par = (x - 1) / 2;

        while (x > 0 && heap.get(x) < heap.get(par)) {

            int temp = heap.get(x);
            heap.set(x, heap.get(par));
            heap.set(par, temp);

            x = par;
            par = (x - 1) / 2;
        }
    }

    public void printHeap() {
        System.out.println(heap);
    }

    public static void main(String[] args) {
        heap h = new heap();

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(60);

        h.printHeap();
    }
}