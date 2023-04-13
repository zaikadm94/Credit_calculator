public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int result = service.payment(1000000,2);
        System.out.println(result);

    }
}