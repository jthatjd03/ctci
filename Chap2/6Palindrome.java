public class Palindrome{

	public boolean isPalindrome(Node node){
		Node runner = node;
		Node beg = node;
		while(runner.next!=null){
			runner = runner.next.next;
			node = node.next;
		}
		if(runner!=null){
			node = node.next;
		}
		while(node!=null){
			if(node.val!=beg.val){
				return false;
			}
		}
		return true;
	}
}