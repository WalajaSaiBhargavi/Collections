package LambdaExpressions;

public class Second {
    interface myinter{
        void operation(int a, int b);
    }
    public static void main(String[] args) {
        myinter addobj = (a, b) ->  {
            int k = a+b;
            System.out.println(k);
        };
        myinter mulobj = (a, b) ->  {
            int k = a*b;
            System.out.println(k);
        };
        new Second().execute(mulobj);
        new Second().execute(addobj);
    }
    public void execute(myinter obj){
        obj.operation(5,4);
    }
}
