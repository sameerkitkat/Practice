class AnagramStrings {

    private void checkAnagrams(String str1, String str2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr2[str1.charAt(i) - 'a']++;
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum2 += arr2[i];
        }
        if (sum1 == sum2) {
            System.out.println("Anagrams");
        } else {
            System.out.println("No Anagrams");
        }
    }

    public static void main(String[] args) {
        String str1 = "sameer";
        String str2 = "reemas";
        AnagramStrings anagramstrings = new AnagramStrings();
        anagramstrings.checkAnagrams(str1, str2);
    }

}
