class ReverseString{
    private void reverseString(String string){
        int i=0,j=string.length()-1;
        char temp;
        char [] str = string.toCharArray();
        while (i<=j){
            temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;j--;
        }
        for(int k=0;k<str.length;k++){
            System.out.print(str[k]);
        }
    }
    public static void main(String[] args) {
        String string = "sameer";
        ReverseString reversestring = new ReverseString();
        reversestring.reverseString(string);
    }
}