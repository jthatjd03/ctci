public class TripleStep{
	public int countWays(int n){
		if(n<0){
			return 0;
		}
		if(n==1){
			return 1;
		}		

		return countWays(n-1)+countWays(n-2)+countWays(n-3);
	}

	public int countWays(int n){
		int[] array = new int[n];
		Arrays.fill(array, -1);

		return countWays(n, array);
	}	

	public int countWays(int n, int[] array){
		if(array[n] != -1){
			return array[n];
		}

		if(n<0){
			return 0;
		}
		if(n==1){
			return 1;
		}		
		
		int countWays = countWays(n-1, array)+countWays(n-2, array)+countWays(n-3, array);
		array[n] = countWays;
		return countWays
	}
}