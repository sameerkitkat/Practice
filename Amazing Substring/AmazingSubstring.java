class AmazingSubstring {

  private void findAmazingSubstring(String str) {
    int length = str.length();
    int number = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
          || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
          || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
        number += length - i;
      }
    }
    System.out.println(number);
  }

  public static void main(String[] args) {
    String str = "ABEC";
    AmazingSubstring amazingsubstring = new AmazingSubstring();
    amazingsubstring.findAmazingSubstring(str);
  }
}
