public class SortedMerge{
	public void sortedMarge(int[] a1, int[] a2){
		int index1 = 0;
		int index2=a2.length-1;
		int insertIndex = a1.length-1;
		while(a1[index]!=0){
			index1++;
		}
		index1--;

		while(insertIndex>=0){
			if(index1<=0){
				a1[insertIndex]=a2[index2];
				index2--;
			}else if(insert2<=0){
				a1[insertIndex] = a1[index1]; 
				index1--;

			}else{
				if(a1[index1]>a2[index2]){
					a1[insertIndex]=a1[index1];
					index1--;
				}else{
					a1[insertIndex]=a2[index2];
					index2--;
				}
			}
			insertIndex--;
		}s
	}
}