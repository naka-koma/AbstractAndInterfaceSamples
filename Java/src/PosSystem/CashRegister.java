package PosSystem;

/**
 * レジシステム
 */
public abstract class CashRegister implements IRegist
{
    /**
     * 会計金額
     */
    protected int price;

    /**
     * 会計金額を取得
     * @return 会計金額
     */
    public int getPrice() {
        return price;
    }

    /**
     * コンストラクタ
     */
    public CashRegister()
    {
        price = 0;
    }

    /**
     * 登録
     * @param name 商品名
     * @param value 値段
     * @return 登録成否
     */
    public boolean regist(String name, int value)
    {
        System.out.println(String.format("Registed,%s,\\%d", name, value));
        price += value;
        return true;
    }

    /**
     * お会計
     * @param money 支払い金額
     * @return お釣り
     */
    public abstract int payment(int money);
}
