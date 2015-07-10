public class PalindromePermutation{
	public boolean isPalindrome(String s){
		Set<Character> set = new HashSet<Character>();
		for(int i =0;i<s.length;i++){
			char c = s[i];
			if(set.contains(s)){
				set.remove(s);
			}else{
				set.add(s);
			}
		}

		return set.size() == 1;
	}
}