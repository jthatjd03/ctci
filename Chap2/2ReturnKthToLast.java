public class ReturnKthToLast{
	public Node returnKthToLast(Node node, int k){
		Node runner = node;
		for(int i = 0; i < k; i++){
			if(runner == null){
				return null;
			}
			runner = runner.next;
		}
		while(runner!=null){
			node = node.next;
			runner = runner.next;
		}

		return node;
	}
}