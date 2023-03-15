package ca.brennanleblanc.SWE4403Lab7.E01;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection implements Collection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public List<Product> getList() {
    return products;
  }

  public CollectionIterator createIterator() {
    return new ProductIterator(this);
  }

}
