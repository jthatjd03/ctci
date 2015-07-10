public class URLify {
	public void urlify(char[] charArray){
		for(int i=s.length-1;i>=0;i--){
			char c = charArray[i];
			if(c == ' '){
				charArray[i] = '0';
				charArray[i-1] = '2';
				charArray[i-2] = '%';
			}
		}
	}
}