public class CheckBalanced{
	public boolean isTreeBalanced(Node root){
		return getHeight(root) != -1;
	}

	public int getHeight(Node root){
		if(root==null){
			return 0;
		}
		int leftHeight = 0
		if(root.left!=null){
			leftHeight = getHeight(root.left);
		}
		if(leftHeight==-1){
			return -1;
		}

		int rightHeight = 0
		if(root.right!=null){
			rightHeight = getHeight(root.right);
		}
		if(rightHeight==-1){
			return -1;
		}
		
		if(Math.abs(leftHeight - rightHeight)>1){
			height = -1;
		}
		return Math.max(leftHeight, rightHeight)+1;
	}
}