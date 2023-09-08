public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[maxSize + 1];
        heap[0] = Integer.MIN_VALUE; // Sentinel value for the root
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos;
    }

    private int rightChild(int pos) {
        return 2 * pos + 1;
    }

    private boolean isLeaf(int pos) {
        return pos >= (size / 2) && pos <= size;
    }

    private void swap(int fpos, int spos) {
        int temp;
        temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }

    private void minHeapify(int pos) {
        if (!isLeaf(pos)) {
            if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
                if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element) {
        if (size >= maxSize) {
            return;
        }
        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int remove() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            size--;
            return heap[1];
        }

        int popped = heap[1];
        heap[1] = heap[size--];
        minHeapify(1);
        return popped;
    }

    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent: " + heap[i] + " ");
            System.out.print("Left Child: " + heap[2 * i] + " ");
            System.out.print("Right Child: " + heap[2 * i + 1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        minHeap.insert(4);
        minHeap.insert(3);
        minHeap.insert(7);
        minHeap.insert(1);
        minHeap.insert(8);

        System.out.println("Min Heap:");
        minHeap.print();

        System.out.println("Removing the minimum element: " + minHeap.remove());

        System.out.println("Min Heap after removal:");
        minHeap.print();
    }
}
