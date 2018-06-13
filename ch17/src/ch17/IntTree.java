package ch17;
//binary tree class to construct a sequential tree
//will print structure data

//pre order root, left right
//inorder left, root, right
//postorder left, right, root


public class IntTree {
	
	private IntTreeNode overallRoot;
	
	//constructor  a sequential tree with a given number of nodes
	public IntTree(int max){
		if (max<=0){
			throw new IllegalArgumentException("max" + max);
		}
		overallRoot = buildTree(1,max);
	}
	//return sequential tree with n as its root
	//if n greater than max will return empty tree
	private IntTreeNode buildTree(int i, int max) {
		if(i > max){
		return null;
		}else{
			return new IntTreeNode(i, buildTree(2*i,max), buildTree(2*i + 1,max));
		}
	}
	
	
	//print the tree with pre order traversal
	
	public void printPreOrder(){
		System.out.println("preorder: " );
		printPreOrder(overallRoot);
		System.out.println();
	}
	
	//print the tree content with preorder and with a given root
	private void printPreOrder(IntTreeNode root) {
		if(root!=null){
			System.out.println(" " + root.data);
			printPreOrder(root.left);
			printPreOrder(root.right);
		}
		
	}
	
	//print tree in oreder traversal 
	public void printInOrder(){
		System.out.println("inorder: ");
		printInOrder(overallRoot);
	}
	private void printInOrder(IntTreeNode root) {
		if(root!=null){
			printInOrder(root.left);
			System.out.println(" " + root.data);
			printInOrder(root.right);
		}
		
	}
	//print tree using post order
	
	public void printPostOrder(){
		System.out.println("postOrder ");
		printPostOrder(overallRoot);
		System.out.println();
	}
	
	//print the tree post order with a given root
	private void printPostOrder(IntTreeNode root) {
		if(root!=null){
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.println(" " + root.data);
		}
		
	}
	
	
	//
	public void printSideWays(){
		
		printSideWays(overallRoot, 0);
		
	}
	private void printSideWays(IntTreeNode root, int level) {
	if(root!=null){
		printSideWays(root.right, level +1);
		
		for(int i = 0; i< level;i++){
			System.out.println("    ");
		}
		System.out.println(root.data);
		printSideWays(root.left, level+1);
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
