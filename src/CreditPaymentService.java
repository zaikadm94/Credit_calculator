public class CreditPaymentService {

    public int payment(int amountRub, int termYears) {
        double percent = (9.99 / 100) / 12;
        double monthlyPayment = (amountRub * percent) / (1 - Math.pow(1 + percent, -termYears * 12));

        return (int) monthlyPayment;


    }
}
