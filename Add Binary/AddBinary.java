public class AddBinary {
 
	private String addBinary(String a, String b) {
	    StringBuilder sb = new StringBuilder();
	    int i = a.length() - 1, j = b.length() -1, carry = 0;
	    while (i >= 0 || j >= 0) {
	        int sum = carry;
	        if (j >= 0) {
	        	sum = sum + b.charAt(j--) - '0';
	        }
	        if (i >= 0) {
	        	sum = sum + a.charAt(i--) - '0';
	        }
	        sb.append(sum % 2);
	        carry = sum / 2;
	    }
	    if (carry != 0) {
	    	sb.append(carry);
	    }
	    return sb.reverse().toString();
	}
	public static void main(String[] args) {
	 String str1 = "11";
	 String str2 = "1";
	 AddBinary ab = new AddBinary();
	 String ans = ab.addBinary(str1, str2);
	 System.out.println(ans);
 }
}
