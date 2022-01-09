package PosSystem;

import java.lang.Math;

/**
 * キャッシャー
 */
public class Casher extends CashRegister
{
    /**
     * コンストラクタ
     */
    public Casher()
    {
        super();
    }

    /**
     * お会計
     * @param money 支払い金額
     * @return お釣り
     */
    @Override public int payment(int money)
    {
        int bill = money - getPrice();
        price = 0;
        return Math.max(0, bill);
    }
}