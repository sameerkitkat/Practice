class ReverseInteger{
    private int reverseInteger(int number){
        int revnumber=0;
        while(number>0){
        revnumber = revnumber *10 + number % 10;
        number = number/10;
        }
        return revnumber;
    }
    public static void main(String[] args) {
        int number = 123;
        ReverseInteger reverseinteger = new ReverseInteger();
        int num = reverseinteger.reverseInteger(number);
        System.out.println(num);
    }
}