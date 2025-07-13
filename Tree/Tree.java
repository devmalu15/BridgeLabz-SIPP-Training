public class BinaryTree {
	TreeNode root; 
	
	public BinaryTree(){
		root = null;
	}
	
	
	public void display() {
		TreeNode node = root;
		if(node == null) {
			System.out.println("empty tree!");
		}
		else {
			System.out.print(node.data + " ");
		    display(node.left);
		    display(node.right);
		}
	}

}
