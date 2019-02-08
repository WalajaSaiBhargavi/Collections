package LearnList;

public class ProductFicture {
    static Product door = new Product("door", 32);
    static Product window = new Product("window", 22);
    static Product floorpannel = new Product("floorpannel", 12);
    public static void main(String[] args){
        Shipment s = new Shipment();
        s.add(door);
        s.add(window);
        s.add(floorpannel);
        s.prepare();
    }
}
