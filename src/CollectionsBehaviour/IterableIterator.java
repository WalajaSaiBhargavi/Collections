package CollectionsBehaviour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterableIterator {
    //Can nor modify an itarable in for loop throws concurrent modification error.
    //So extract an iterator from the iterable and modify any collection
    public Collection<Product> products = new ArrayList<>();
    Product door = new Product("door", 32);
    Product window = new Product("Window", 10);
    Product floorPannel = new Product("floorPannel", 12);
    Product shelf = new Product("shelf", 22);
    Product ceiling = new Product("ceiling", 40);
    Product paint = new Product("paint", 5);
    public Collection<Product> makeCollection(){

        products.add(door);
        products.add(window);
        products.add(floorPannel);
        products.add(shelf);
        products.add(ceiling);
        products.add(paint);
        return products;
    }

    public void iterate(){
        Iterator<Product> myIterator = products.iterator();
        while(myIterator.hasNext()){
            //here we are able to print easily because our ArrayList has tostring method which we have over ridden in product class
            System.out.println(myIterator.next());
        }
    }

    public Collection<Product> otherProducts() {
        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(door);
        otherProducts.add(window);
        return otherProducts;
    }
}
