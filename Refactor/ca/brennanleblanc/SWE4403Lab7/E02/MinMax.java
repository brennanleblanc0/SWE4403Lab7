package ca.brennanleblanc.SWE4403Lab7.E02;

public class MinMax {
    private int[] collection;

    public MinMax(int[] collection) {
        this.collection = collection;
    }

    public int getMax() {
        CollectionIterator iterator = new NumberIterator(collection);
        int max = 0;
        while (iterator.hasNext()) {
            int temp = iterator.getNext();
            if (temp > max)
                max = temp;
        }
        return max;
    }

    public int getMin() {
        CollectionIterator iterator = new NumberIterator(collection);
        int min = 0;
        while (iterator.hasNext()) {
            int temp = iterator.getNext();
            if (temp < min)
                min = temp;
        }
        return min;
    }
}
