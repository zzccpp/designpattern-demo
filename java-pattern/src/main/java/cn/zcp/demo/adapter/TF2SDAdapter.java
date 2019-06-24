package cn.zcp.demo.adapter;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 18:27
 * @describe designpattern-demo
 *
 * TF卡转SD卡的适配器
 */
public class TF2SDAdapter implements SDCard{

    private TFCard tfCard;

    public TF2SDAdapter(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("通过tf转sd卡适配器!");
        return tfCard.readTFCard();
    }

    @Override
    public void writeSD(String str) {
        System.out.println("通过tf转sd卡适配器!");
        tfCard.writeTFCard(str);
    }
}
