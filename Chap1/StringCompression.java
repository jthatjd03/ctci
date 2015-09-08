public class StringCompression{

	public String stringCompression(String s){
		if(s = =null){
			return null;
		}
		if(s.length()==0 || s.length()==1){
			return s;
		}
		StringBuilder sb = new StringBuilder();		
		int count = 1;
		char previousChar = s.charAt(0);
		for(int i = 1;i<s.length;i++){
			if(s[i]==previousChar){
				count++;
			}else{
				sb.append(previousChar + count);
				count = 0;
				previousChar = s[i];
			}
		}
		return sb.toString().length() > s.length ? sb.toString() : s;
	}
}