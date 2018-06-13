package ch17;

public class Client {

	public static void main(String[] args) {
		IntTree t = new IntTree(12);
		
		System.out.println("tree structure: ");
		
		t.printSideWays();
		System.out.println();
		t.printPreOrder();
		t.printInOrder();
		t.printPostOrder();

	}

}
