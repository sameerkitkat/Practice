class RepeatAndMissingNumberArray {
    private void repeatAndMissingNumberArray(int[] array) {
        boolean[] seen = new boolean[array.length];
        int duplicate_num = 0, missing_num = 0;
        int expected_sum = (array.length) * (array.length + 1) / 2;
        int actual_sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (seen[array[i] - 1]) {
                duplicate_num = array[i];
            }
            seen[array[i] - 1] = true;
            actual_sum += array[i];
        }
        missing_num = expected_sum - actual_sum + duplicate_num;
        System.out.println(duplicate_num);
        System.out.println(missing_num);
    }

    public static void main(String[] args) {
        int[] array = { 3, 1, 3, 5, 2 };
        RepeatAndMissingNumberArray repeatandmissingnumberarray = new RepeatAndMissingNumberArray();
        repeatandmissingnumberarray.repeatAndMissingNumberArray(array);
    }
}