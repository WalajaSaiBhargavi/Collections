package LearnSets;

import java.util.HashSet;
import java.util.Set;

public class App {
    Set<Product> set = new HashSet<>();
    public static void main(String[] args){
        Product product = new Product("door", 22);
        Product product1 = new Product("door", 22);;
        Set set = new HashSet<>();
        set.add(product);
        set.add(product1);
        System.out.println(set);
    }
}
