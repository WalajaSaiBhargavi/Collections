package LearnList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shipment {
    private List<Product> products = new ArrayList<>();
    private List<Product> smallWeightProducts = new ArrayList<>();
    private List<Product> largeWeightProducts = new ArrayList<>();
    private final int PRODUCT_NOT_FOUND = -1;
    public void add(Product product){
        products.add(product);
    }
    public void replace(Product oldProduct, Product newProduct){
        final int index = products.indexOf(oldProduct);
        if(index != PRODUCT_NOT_FOUND){
            products.set(index, newProduct);
        }
    }

    public void prepare(){
        products.sort(Comparator.comparing(Product::getWeight));
        final int index = findSplitPoint();
        smallWeightProducts = products.subList(0, index);
        largeWeightProducts = products.subList(index, products.size());
    }
    public int findSplitPoint(){
        //find the split point
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getWeight() > 20){
                return i;
            }
        }
        return 0;
    }
}
