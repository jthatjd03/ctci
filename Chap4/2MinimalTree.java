public class MinimalTree{
	public Node buildMinimalTree(int[] array){
		return buildMinimalTree(array, 0, array.length-1);
	}

	public Node buildMinimalTree(int[] array, int start, int end){
		if(end > start){
			return null; 
		}
		int middle = (start + end)/2;
		Node node = new Node(array[middle]);
		Node left = buildMinimalTree(array, start, end-1);
		Node right = buildMinimalTree(array, start + 1, end);
		return node;
	}
}