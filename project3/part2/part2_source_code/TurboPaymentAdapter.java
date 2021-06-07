public class TurboPaymentAdapter implements ModernPayment{

    TurboPayment payment;

    public TurboPaymentAdapter(TurboPayment payment){
        this.payment= payment;
    }

    public int pay(String cardNo, float amount, String destination, String installments){

        return payment.payInTurbo(cardNo,amount,destination,installments);
    }
}
