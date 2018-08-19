
public class BinaryTree<T extends Comparable<T>> {
	private Node<T> root;

	public BinaryTree() {
		this.root = null;
	}

	public Node<T> insert(T v) {
		if (root == null) {
			root = new Node<T>(v);
			return root;
		} else {
			Node<T> temp = root;
			Node<T> previous = null;

			while(temp != null) {
				previous = temp;

				if(v.compareTo(temp.value) < 0) {
					temp = temp.left;

				} else {
					temp = temp.right;
				}
			}

			if (v.compareTo(previous.value) < 0) {
				previous.left = new Node<T>(v);
			}
			else {
				previous.right = new Node<T>(v);
			}

			return previous;
		}
	}

	public void print(Node<T> root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.value + " ");
			print(root.right);

		}
	}

	public void print() {
		print(root);
	}

	public static void main(String args[]) {
		BinaryTree<String> a = new BinaryTree<String>();
		a.insert("d");
		a.insert("i");
		a.insert("p");
		a.insert("i");
		a.insert("s");
		a.insert("h");
		a.insert("a");
		
		a.print();
		
		System.out.println();

		BinaryTree<Integer> b = new BinaryTree<Integer>();
		b.insert(30);
		b.insert(20);
		b.insert(50);
		b.insert(2);
		b.insert(4);
		b.insert(3);
		b.insert(45);

		b.print();


	}
}
