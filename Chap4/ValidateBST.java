public class ValidateBST{
	public boolean isBST(Node root){
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBST(Node root, int min, int max){
		if(root==null){
			return true;
		}
		boolean isRootValidBST = false;
		if(root.val >= min && root.val < max){
			isRootValidBST = true;
		}
		boolean isLeftBST = false;
		if(root.left!=null){
			isLeftBST = isBST(root.left, min, root.val);
		}
		boolean isRightBST = false;
		if(root.right!=null){
			isRightBST = isBST(root.right, root.val, max);
		}		
		return isRightBST && isLeftBST && isRootValidBST;
	}
}