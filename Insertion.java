public class Insertion {
	public int insertion(int m, int n, int i, int j){
		for(int k =i;k<j=;k++){
			boolean isOneBit = isOneBit(m, k);
			updateBit(n, k, isOneBit);
		}
	}

	private boolean isOneBit(int num, int index){
		return ((1&1<<index)!=0);
	}

	private int updateBit(int num, int i, boolean isOneBit){
		int value = isOneBit?1:0;
		int mask = ~(1<<i);
		return (mask & num) | (value<<i);
	}

	public int insertion(int m, int n, int i, int j){
		n=10000000
		m= 10011  =>11001100
		i=2
		j=6
		int allOnes = ~0;
		int left = allOnes << j+1;  10000000
		int right = 1<<i-1 1000000=>00000011
		int mask = left | right;    10000011
		n = mask & n; 				10000000 =>10000000
		m = m << i; 				01001100
		return m | num 				11001100
}

