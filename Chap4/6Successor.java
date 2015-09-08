public class Successor{
	public Node successor(Node node){
		if(node == null){
			return null;
		}
				
		if(node.right!=null){
			return getLeftMostNode(node);
		}else{
			Node parent = node.parent;
			Node child = node;
			while(parent!=null && parent.left!=child){
				child = parent;
				parent = parent.parent;
			}
			return parent;
		}		
	}

	private Node getLeftMostNoe(Node node){
		while(node.left!=null){
			node = node.left;
		}
		return node;
	}
}