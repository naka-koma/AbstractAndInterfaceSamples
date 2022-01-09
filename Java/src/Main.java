import javax.print.event.PrintEvent;

import PosSystem.*;

public class Main 
{
	public static void main(String[] args) 
    {
		// 店員さんを召喚
		Stuff stuff = new Stuff();

		// 普通のレジ
		Casher casher = new Casher();
		// 店員さんは普通のレジの使い方を知ってるからちゃんとレジができる
		stuff.PosRegist(casher, "コーヒー豆(200g)", 800);
		stuff.PosRegist(casher, "チーズ", 600);
		stuff.PosRegist(casher, "生ハム", 1000);
		int change = casher.payment(2500);
		System.out.println("お釣り:" + change);

		// 進化したレジがきた！
		NextGenerationCasher ngCasher = new NextGenerationCasher();
		// 店員さんは実はすごいので、新しいレジの使い方を知ってるからちゃんと仕事できる
		stuff.PosRegist(ngCasher, "ポテトチップス", 150);
		System.out.println("支払い方法を選択 -> 現金");
		ngCasher.setPaymentKind(PaymentKind.CASH);
		change = ngCasher.payment(200);
		System.out.println("お釣り:" + change);

		stuff.PosRegist(ngCasher, "缶コーヒー", 110);
		System.out.println("支払い方法を選択 -> クレジットカード");
		ngCasher.setPaymentKind(PaymentKind.CREDIT_CARD);
		change = ngCasher.payment(110);
		System.out.println("お釣り:" + change);

		stuff.PosRegist(ngCasher, "唐揚げ弁当", 498);
		System.out.println("支払い方法を選択 -> QRコード決済");
		ngCasher.setPaymentKind(PaymentKind.QR_CODE);
		change = ngCasher.payment(498);
		System.out.println("お釣り:" + change);
	}
}
