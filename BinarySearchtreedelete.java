class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		}
	}
public class BinarySearchTree{
	Node root;
	void delete(int data){
	root=delete Node(root,data);
	}
Node deleteNode (Node current +Node,int data){
if(cureent+Node==null){
	return currentNode;
}
if(data<currentNode.data){
	currentNode.left=deleteNode (currentNode.left,data);
}else if(data>currentNode.data){
current Node.right=delete Node(current Node.right,data);
}else{
	if (current Node.left==null){
	return currentNode.right;
	} else if currentNode.right==null){
		return currentNode.left;
	}
}
return currentNode;
}
void printtree(){
printTree(root);
}
void printTree(Node node){
	if (node!=null){
		printTree (node.left);
		system.out.print(node.data+"");
		
		printTree (node.right);
	}
}
public static void main (String[] args){
	BinarySearchtree bst=new BinarySearchTree();

bst.root=new node(50);
bst.root.left=new node(30);
bst.root.right=new node(70);
bst.root.right.left=new node(20);
bst.root.left.right=new node(40);

System.out.println("After deletion:");
bst.printTree();
}
}

