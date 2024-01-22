public class BinaryTree<T> {
    
    private Node root;
    
    class Node{
        private T data;
        private Node left;
        private Node right;
        
        Node(T data){
            this.data = data;
            left = null;
            right = null;
        }
        
        Node getLeft(){
            return left;
        }
        
        Node getRight(){
            return right;
        }
        
        T getData(){
            return data;
        }
        
        void setLeft(T left){
            this.left = new Node(left);
        }
        
        void setRight(T right){
            this.right = new Node(right);
        }
        
    }
    
    public BinaryTree(T rootData){
        root = new Node(rootData);
    }
    
    public void addNode(T data, Node previous, boolean direction){
        if(!direction){
            previous.setLeft(data);
        }
        else{
            previous.setRight(data);
        }
    }
    
    private void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.getLeft());
            System.out.print("| " + node.getData() + " |");
            traverseTree(node.getRight());
        }
    }
    
    public void traverseTree(){
        traverseTree(root);
    }
    
    public Node getRoot(){
        return root;
    }
}