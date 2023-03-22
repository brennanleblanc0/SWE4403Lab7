package ca.brennanleblanc.SWE4403Lab7.E02;

public class NumberIterator implements CollectionIterator {
    private int[] collection;
    private int currentPos;

    public NumberIterator(int[] collection) {
        this.collection = collection;
        currentPos = 0;
    }

    @Override
    public int getNext() {
        if (hasNext()) {
            int temp = collection[currentPos];
            currentPos++;
            return temp;
        } else {
            return collection[currentPos];
        } 
    }

    @Override
    public boolean hasNext() {
        return currentPos < collection.length;
    }
}
