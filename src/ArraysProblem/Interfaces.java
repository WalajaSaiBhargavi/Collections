package ArraysProblem;
public class Interfaces {
    public static void main(String args[]){
        child c = new child();
        parent p = new parent();
        parent pc = new child();
        p.display();
        System.out.println(c.var+" "+p.var+" "+pc.var);
        System.out.println(c.getVar());
        System.out.println(c.var+" "+p.var+" "+pc.var);
        System.out.println(c.var);
        p.display();
        c.display();
        pc.display();
        OverLoadingExample o = new OverLoadingExample();
        o.add(1,2);
    }
}
class parent{
    public int var = 10;
     public  void display(){
        System.out.println("this will be displayed as parent");
     }

    public int getVar() {
        return var;
    }
}
class child extends parent{
    public int var = 20;
    @Override
     public  void display(){
         System.out.println("this will be displayed as child");
    }
    public static void count(){
        System.out.println("this will be displayed as child");
    }
}
class OverLoadingExample{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
