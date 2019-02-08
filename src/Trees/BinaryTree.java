package Trees;


import java.util.Random;
import java.util.Scanner;

public class BinaryTree {


    public static void main(String[] args) {
        Node obj = new Node(5);
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            obj.insert(r.nextInt(100));
        }

        obj.traverse();
        System.out.println(obj.contains(new Scanner(System.in).nextInt()));

    }
}
