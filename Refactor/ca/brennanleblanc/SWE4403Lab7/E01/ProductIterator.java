package ca.brennanleblanc.SWE4403Lab7.E01;

import java.util.List;

public class ProductIterator implements CollectionIterator {
    private int currentPos;
    private ProductCollection collection;
    private List<Product> cache;

    public ProductIterator(ProductCollection collection) {
        this.collection = collection;
        currentPos = 0;
        cache = null;
    }

    public Product getNext() {
        if (hasNext())
            currentPos++;
        return collection.getList().get(currentPos);
    }

    public boolean hasNext() {
        if (cache == null) {
            cache = collection.getList();
            return false;
        } else {
            return currentPos < cache.size() - 1;
        }
        
    }
}
