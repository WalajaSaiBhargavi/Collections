package LambdaExpressions;

public class First {
    interface MyInterface{
        void func(int x);
    }
    public static void main(String[] args) {
        MyInterface obj = (int x) -> System.out.println(x);
        new First().execute(obj);
    }
    public void execute(MyInterface obj){
        obj.func(5);
    }
}

