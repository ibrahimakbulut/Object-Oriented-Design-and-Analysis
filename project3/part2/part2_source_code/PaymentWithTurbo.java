public class PaymentWithTurbo implements TurboPayment{

    public int payInTurbo(String turboCardNo, float turboAmount, String destinationTurboOfCourse, String installmentsButInTurbo){
        System.out.printf("%f money transferred from %s to %s, with installments: %s\n",turboAmount,turboCardNo,destinationTurboOfCourse,installmentsButInTurbo);
        return 1;
    }
}
