package Generics;

public class Firs <T> {
    public T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

class hello{
    public static void main(String[] args) {
        Firs<String> f = new Firs<String>();
        f.setObj("huhd");
        f.setObj("1");
    }
}
