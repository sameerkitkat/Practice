class FirstUniqueCharacter{
    private int findFirstUniqueCharacter(String s){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        String str = "loveleetcode";        
        FirstUniqueCharacter firstuniquecharacter = new FirstUniqueCharacter();
        int index = firstuniquecharacter.findFirstUniqueCharacter(str);
        System.out.println(index);
    }
}