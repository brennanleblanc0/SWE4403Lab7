package ca.brennanleblanc.SWE4403Lab7.E01;

public class Demo {
    public static void main(String[] args) {
        Product product1 = new Product(0, "Orange");
        Product product2 = new Product(1, "Banana");
        Product product3 = new Product(2, "Apple");

        ProductCollection collection = new ProductCollection();
        collection.add(product1);
        collection.add(product2);

        CollectionIterator iterator = collection.createIterator();

        System.out.println("\nTesting first two Products\n");
        System.out.println(iterator.getNext());
        System.out.println(iterator.getNext());

        collection.add(product3);

        System.out.println("\nTesting adding 1 more product and attempting past limit\n");
        System.out.println(iterator.getNext());
        System.out.println(iterator.getNext());

        iterator = collection.createIterator();

        System.out.println("\nTesting a new iterator\n");
        System.out.println(iterator.getNext());
    }
}
