package CollectionsBehaviour;

import java.util.ArrayList;
import java.util.Collection;

public class App {

    public static void main(String[] args){
        IterableIterator I = new IterableIterator();
        System.out.println(I.makeCollection());
        I.iterate();
        I.otherProducts();
        I.makeCollection().removeAll(I.otherProducts());
        System.out.println(I.makeCollection());
    }
}
