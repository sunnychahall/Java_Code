import java.lang.reflect.Array;
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

    public void heapify(int root)
    {
        int minIndx = root;
        int l = 2 * root + 1;
        int r = 2 * root + 2;
        //update min
         if (l < heap.size() && heap.get(l) < heap.get(minIndx))
            {
                minIndx = l;
            }
         if (r < heap.size() && heap.get(r) < heap.get(minIndx))
            {
                 minIndx = r;
            }


        if (minIndx != root)
            {
                //swap
                int temp = heap.get(root);

                heap.set(root, heap.get(minIndx));

                heap.set(minIndx, temp);

                heapify(minIndx);
                
            }
    }

    public int delete()
    {
        if (heap.isEmpty())
            return -1;

        int data = heap.get(0);

        //swap
        int temp = heap.get(heap.size() - 1);
        heap.set(heap.size() - 1, heap.get(0));
        heap.set(0, temp);
       
        heap.remove(heap.size() - 1);
        //heapify for root
        if (!heap.isEmpty()) {
            heapify(0);
        }

        //return
        return data;
    }

    public static void main(String[] args) {
        heap h = new heap();

        h.insert(50);
        h.insert(30);
        h.insert(40);
        h.insert(10);
        h.insert(60);

        h.printHeap();
        h.delete();
        h.printHeap();
    }
}