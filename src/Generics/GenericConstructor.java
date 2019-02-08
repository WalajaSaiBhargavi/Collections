package Generics;

public class GenericConstructor<T> {
    public T height;
    public T width;
    public T length;
    public GenericConstructor(T height, T width, T length ){
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public static void main(String[] args) {
        GenericConstructor<String> g = new GenericConstructor<String>("1v", "2", "3");
    }
}
