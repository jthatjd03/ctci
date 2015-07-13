public class ListOfDepths{
	public List<LinkedListNode> getListOfDepths(Node root){
		List<LinkedListNode> list = new ArrayList();
		Deque<Node> queue = new ArrayDeque();
		queue.addLast(root);


		while(!queue.isEmpty()){
			Deque<Node> queue2 = new ArrayDeque();						
			LinkedListNode previous = new Node(-1);
			LinkedListNode nodeToAdd = previous;
			while(!queue.isEmpty()){
				Node node = queue1.removeFirst();
				LinkedListNode linkedListNode = new LinkedListNode(node.val);
				nodeToAdd.add(linkedListNode);
				
				if(node.left!=null){
					queue2.addLast(node.left);
				}
				if(node.right!=null){
					queue1.addLast(node.right);
				}							
			}
			list.add(nodeToAdd.next);
			queue1 = queue2;
		}
		return list;
	}
}