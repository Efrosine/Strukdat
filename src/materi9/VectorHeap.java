package materi9;

import java.util.Vector;

public class VectorHeap {
    private Vector data;

    public VectorHeap() {
        data = new Vector();
    }

    public VectorHeap(Vector v) {
        int i;
        data = new Vector(v.size());
        for (i = 0; i < v.size(); i++) {
            add((Comparable) v.elementAt(i));
        }
    }

    protected static int parentOf(int i) {
        return (i - 1) / 2;
    }

    protected static int leftChildOf(int i) {
        return 2 * i + 1;
    }

    protected static int rightChildOf(int i) {
        return 2 * (i + 1);
    }

    public Comparable peek() {
        return (Comparable) data.elementAt(0);
    }

    public Comparable remove() {
        Comparable minVal = (Comparable) data.elementAt(0);
        Comparable lastVal = (Comparable) data.remove(data.size() - 1);
        if (data.size() > 0) {
            data.setElementAt(lastVal, 0);
            percolateDown(0);
        }
        return minVal;
    }

    public void percolateDown(int root) {
        int heapSize = data.size();
        Comparable val = (Comparable) data.elementAt(root);
        while (root < heapSize) {
            int childpos = leftChildOf(root);
            if (childpos < heapSize) {
                if ((rightChildOf(root) < heapSize) && (((Comparable) data.elementAt(childpos + 1))
                        .compareTo((Comparable) data.elementAt(childpos)) < 0)) {
                    childpos++;
                }
                if (((Comparable) data.elementAt(childpos)).compareTo(val) < 0) {
                    data.setElementAt(data.elementAt(childpos), root);
                    root = childpos;
                } else {
                    data.setElementAt(val, root);
                    return;
                }
            } else {
                data.setElementAt(val, root);
                return;
            }
        }
    }

    public void add(Comparable val) {
        data.addElement(val);
        percolateUp(data.size() - 1);
    }

    public void percolateUp(int leaf) {
        int parent = parentOf(leaf);
        Comparable value = (Comparable) data.elementAt(leaf);
        while (leaf > 0 && (value.compareTo((Comparable) data.elementAt(parent)) < 0)) {
            data.setElementAt(data.elementAt(parent), leaf);
            leaf = parent;
            parent = parentOf(leaf);
        }
        data.setElementAt(value, leaf);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void clear() {
        data.clear();
    }

    public String toString() {
        return "<VectorHeap: " + data + ">";
    }

    public static void main(String[] args) {
        VectorHeap heap = new VectorHeap();

        // Insert elements
        heap.add(40);
        System.out.println("Heap: " + heap);
        heap.add(20);
        System.out.println("Heap: " + heap);
        heap.add(5);
        System.out.println("Heap: " + heap);
        heap.add(55);
        System.out.println("Heap: " + heap);
        heap.add(76);
        System.out.println("Heap: " + heap);
        heap.add(31);
        System.out.println("Heap: " + heap);
        heap.add(3);
        System.out.println("Heap: " + heap);

        System.out.println("Deleted Min: " + heap.remove());
        System.out.println("Heap: " + heap);

        System.out.println("Deleted Min: " + heap.remove());
        System.out.println("Heap: " + heap);

        heap.add(10);
        System.out.println("Heap: " + heap);
        heap.add(22);
        System.out.println("Heap: " + heap);

        System.out.println("Deleted Min: " + heap.remove());
        System.out.println("Heap: " + heap);

        System.out.println("Deleted Min: " + heap.remove());
        System.out.println("Heap: " + heap);

    }
}
