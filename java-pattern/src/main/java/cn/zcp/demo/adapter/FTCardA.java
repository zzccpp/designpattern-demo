package cn.zcp.demo.adapter;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 18:25
 * @describe designpattern-demo <描述>
 */
public class FTCardA implements TFCard {
    @Override
    public String readTFCard() {
        System.out.println("读取 tfcardA 中的数据.");
        return "tfcardA-data";
    }

    @Override
    public void writeTFCard(String str) {
        System.out.println("往tfcardA中写入数据:"+str);
    }
}
