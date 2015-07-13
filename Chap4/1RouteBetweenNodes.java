public class RouteBetweenNodes{
	public boolean doesRouteExistBetweenNodes(Node n1, Node n2){
		if(n1==null){
			return false;
		}

		if(n1 == n2){
			return true;
		}
		node.visited = true;		
		boolean doesExist;
		for(Node node : n1.adjacent){
			if(!node.visited){
				 doesExist = doesRouteExistBetweenNodes(node, n2);
			}
		}
		return doesExist;
	}

	public boolean doesRouteExistBetweenNodesIterative(Node n1, Node n2){
		if(n1==null || n2==null){
			return false;
		}
		Deque<Node> deque = new ArrayDeque<>();
		deque.addFirst(n1);
		while(!deque.isEmpty){
			Node node = deque.removeFirst();
			if(node == n2){
				return true;
			}
			node.visited = true;
			for(Node adjacent : node.adjacent){
				if(!node.visited){
					deque.addFirst(adjacent);
				}				
			}
		}
		return false;
	}	
}