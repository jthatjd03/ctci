public class WordFrequencies{
	public int countWords(String[] book, String word){
	 	Map<String, Integer> map = new HashMap();
	 	for(String s : book){
	 		if(map.contains(s)){
	 			map.put(s, map.get(s) + 1);
	 		}else{
	 			map.put(s, 1);
	 		}
	 	}

	 	return map.contains(word) ? map.get(word) : 0;
	}
}