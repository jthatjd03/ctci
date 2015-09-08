public class RemoveDupe{
	public void removeDupe(Node node){
		Node previous = null;			
		Node track = node;
		Set<Integer> set = new HashSet<Integer>;

		while(node != null){
			if(set.contains(node.val)){
				node = node.next;
				previous.next=node;
			}else{
				set.add(node.val);
				previous=  node;
				node = node.next
			}
		}
	}
}