package Generics;

public class GenericMethods {

    public static void main(String[] args) {
        GenericMethods g = new GenericMethods();
        Integer[] k = {1, 2, 3, 3, 3, 4, 5};
        System.out.println(g.countAllOcc(k, 3));
        GenericMethods kj = new GenericMethods();
        String [] l = {"bhagi", "bhagi", "l, ", "k"};
        System.out.println(kj.countAllOcc(l,"bhagi"));
    }
    public  <T>  int countAllOcc(T [] list, T item){
        int count = 0;
        if(item == null){
            for(T c : list){
                if(c == item){
                    count++;
                }
            }
        }else {
            for(T c : list){
                if(c == item){
                    count++;
                }
            }
        }
        return count;
    }
}
