public class BinaryTree{
	public class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data=data;
			left=right=null;
		}
	}
	
	Node root;
	
	public void display(Node root) {
		if(root!=null) {
			display(root.left);
			System.out.println(root.data+" ");
			display(root.right);
		}
	}
	
	public static void main(String[] args) {
		BinaryTree obj=new BinaryTree();
		
		obj.root=obj.new Node(11);
		obj.root.left=obj.new Node(22);
		obj.root.right=obj.new Node(33);
		obj.root.left.left=obj.new Node(44);
		obj.root.left.right=obj.new Node(55);
		
		obj.display(obj.root);
	}
}

