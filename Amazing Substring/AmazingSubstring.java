class AmazingSubstring{
	
	private int findAmazingSubstring(String str){
		String vowels = "aeiouAEIOU";
		int count = 0;		
		for (int i=0;i<str.length();i++){
			if (vowels.indexOf(str.charAt(i))!=-1){
				count+=str.length()-i;
				count = count % 10003;
			}
		}
		return count;
	}
	public static void main(String[] args){
		String str = "ABEC";
		AmazingSubstring amazingsubstring = new AmazingSubstring();
		int count = amazingsubstring.findAmazingSubstring(str);
		System.out.println("count = " +count);
	}
}
