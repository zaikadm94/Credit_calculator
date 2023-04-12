public class CreditPaymentService {

    public int payment(int amount_rub, int term_years) {

        double percent = 9.99;
        double monthlyPayment = (amount_rub * percent) / (1 - Math.pow(1 + percent, term_years * 12));

        return (int) monthlyPayment;



    }
}
