package Trees;

public class Node {
    int data;
    Node right, left;
    public Node(int val){
        data = val;
    }
    public void insert(int val){
        if(val < data){
            if(left == null){
                left = new Node(val);
            }else{
                left.insert(val);
            }
        }else {
            if(right == null){
                right = new Node(val);
            }else {
                right.insert(val);
            }
        }
    }

    public boolean contains(int val){
        if(val == data)
            return true;
        if(val < data){
            if(left != null){
                left.contains(val);
            }else {
                return false;
            }
        }else if(val > data){
            if(right != null){
                right.contains(val);
            }else {
                return false;
            }
        }
        return false;
    }

    public void traverse(){
        System.out.println(data);
        if(left != null)
            left.traverse();
        if (right != null)
            right.traverse();
    }

}
