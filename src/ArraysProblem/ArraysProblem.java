package ArraysProblem;

import java.util.Arrays;

public class ArraysProblem {
    public static void main(String[] args){
        Product door = new Product("Door", 22);
        Product window = new Product("Window", 10);
        Product[] products = {door, window};
        System.out.println(Arrays.toString(products));
    }
    public Product[] add(Product[] oldProductsList, Product product){
        int length = oldProductsList.length;
        Product[] newProductsList = Arrays.copyOf(oldProductsList, length);
        newProductsList[length+1] = product;
        return newProductsList;
    }
}
