class FindSquareroot {
    private int findSquareroot(int number) {
        long i = 0;
        long j = (number / 2) + 1;
        while (i <= j) {
            long mid = (i + j) / 2;
            if (mid * mid == number) {
                return (int) mid;
            } else if (mid * mid < number) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return (int) j;
    }

    public static void main(String[] args) {
        int number = 16;
        FindSquareroot findsquareroot = new FindSquareroot();
        System.out.println(findsquareroot.findSquareroot(number));
    }
}