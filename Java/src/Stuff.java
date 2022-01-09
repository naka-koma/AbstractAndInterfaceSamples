import PosSystem.*;

/**
 * 販売員
 */
public class Stuff 
{
    /**
     * コンストラクタ
     */
    Stuff()
    {

    }

    /**
     * 登録
     * @param name 商品名
     * @param value 値段
     * @return 登録成否
     */
    public boolean PosRegist(IRegist register, String name, int value)
    {
        register.regist(name, value);
        return true;
    }
}
