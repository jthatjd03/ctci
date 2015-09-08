public class StackMin extends Stack {
	Stack<Integer> minStack;
	public StackMin(){
		minStack = new Stack<Integer>();
	}

	public int pop(){
		int num = super.pop();
		if(num==min()){
			minStack.pop();
		}
		return num;
	}

	public void push(int i){
		int min = min();
		if(i<min){
			minStack.push(i);
		}
		super.push(i);
	}
	public int min(){
		if(minStack.isEmpty()){
			return Integer.MAX_VALUE;
		}
		minStack.peek();
	}
}