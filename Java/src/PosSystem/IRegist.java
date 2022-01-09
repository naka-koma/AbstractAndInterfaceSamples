package PosSystem;

public interface IRegist {
    /**
     * 登録
     * @param name 商品名
     * @param value 値段
     * @return 登録成否
     */
    public boolean regist(String name, int value);
}
