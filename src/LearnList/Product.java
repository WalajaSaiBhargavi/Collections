package LearnList;

import java.util.Comparator;

public class Product  {
    static Comparator<Product> comparator = Comparator.comparing(Product::getWeight);
    private String name;
    private int weight;

    public Product(){
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

}
