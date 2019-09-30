
public class BinarySearchTree {

	public static void main(String[] args) {
		Node bst = new Node(20);
		Node node = null;
		bst.add(10);
		bst.add(20);
		bst.add(5);
		bst.add(8);
		bst.add(30);
		
		
	}
	
	

}


class Node{
	int data;
	Node right;
	Node left;
	
	Node root= null;
	
	public Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}	
	
	public void add(int value){
		root = insert(root, value);
	}
	
	
	private Node insert(Node node, int data){

		if(node==null){
			node.data=data;
			node.left=null;
			node.right=null;
		}else if(node.data>data){
				node.right.data=data;
				node.right.right=null;
				node.right.left=null;
			
		}
		else{
			node.left.data=data;
			node.left.right=null;
			node.left.left=null;
		
	}
		
		return node;
	}
}