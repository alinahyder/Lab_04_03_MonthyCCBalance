public class Main {
    public static void main(String[] args) {
        double creditCardBal= 5000;
        double interestRate= 0.17;
        double oneMonth;
        double twoMonth;

        oneMonth= creditCardBal*interestRate;
        twoMonth= creditCardBal*interestRate+oneMonth*interestRate;
        System.out.println("The interest due after one month is "+oneMonth);
        System.out.println("The interest due after two months is "+twoMonth);

    }
}