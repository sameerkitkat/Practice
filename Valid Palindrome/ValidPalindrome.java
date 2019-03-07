class ValidPalindrome{
    
    private boolean isPalindrome(String string){
        string = string.replaceAll("\\W","");
        boolean flag =false;
        char[] str = string.toCharArray();
        int i=0,j=str.length-1;
        while(i<j){
            if (str[i]!=str[j]){
                flag = false;
                break;
            }
            flag=true;
            i++;j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String string = "a man, a plan, a canal: panama";     
        ValidPalindrome validpalindrome = new ValidPalindrome();
        boolean flag = validpalindrome.isPalindrome(string);   
        System.out.println(flag);
    }
}