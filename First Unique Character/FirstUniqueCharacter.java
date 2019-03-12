class FirstUniqueCharacter{
    private int findFirstUniqueCharacter(String str){
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str.indexOf(c)==str.lastIndexOf(c)){
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