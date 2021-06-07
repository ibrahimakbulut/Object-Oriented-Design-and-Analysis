public class Main {

    public static void testModernPayment(ModernPayment modernPayment){

        modernPayment.pay("100521",(float)89.456,"100321","Shopping");
        return;
    }
    public static void main(String[] args) {

        TurboPayment turboPayment= new PaymentWithTurbo();

        ModernPayment turboPaymentAdapter= new TurboPaymentAdapter(turboPayment);

        System.out.println("Turbo payment used...");
        turboPayment.payInTurbo("100521",(float)89.456,"100321","Shopping");

        System.out.println("Turbo payment adapter used...");

        testModernPayment(turboPaymentAdapter);

    }
}
