package LearnSets;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Product {
    TreeSet<Integer> set = new TreeSet<>();
    Comparator<Product> comparator = Comparator.comparing(Product::getWeight);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, weight);
    }
}
