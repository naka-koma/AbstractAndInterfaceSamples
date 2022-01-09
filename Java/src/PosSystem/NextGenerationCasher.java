package PosSystem;

import java.lang.Math;

public class NextGenerationCasher extends CashRegister
{
    /**
     * 支払い種別
     */
    PaymentKind paymentKind;

    public PaymentKind getPaymentKind() {
        return paymentKind;
    }

    public void setPaymentKind(PaymentKind paymentKind) {
        this.paymentKind = paymentKind;
    }

    public NextGenerationCasher()
    {
        super();
        paymentKind = PaymentKind.CASH;
    }

    /**
     * お会計
     * @param money 支払い金額
     * @return お釣り
     */
    @Override public int payment(int money)
    {
        // 事前に決めた支払い方法をチェック
        switch(paymentKind)
        {
            case CASH:
            {
                System.out.println("Payment for Cash.");
                break;
            }
            case CREDIT_CARD:
            {
                System.out.println("Payment for Credit Card.");
                break;
            }
            case QR_CODE:
            {
                System.out.println("Payment for QR code.");
            }
            default:
            {
                System.out.println("Unexpected payment type");
                // 本当は支払いなんかできないようにしないといけない
            }
        }
        
        int bill = money - getPrice();
        price = 0;
        return Math.max(0, bill);
    }
}
