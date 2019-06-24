package cn.zcp.demo.adapter;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 18:23
 * @describe designpattern-demo
 */
public interface TFCard {

    /**
     * 读取TF卡中的数据
     * @return
     */
    String readTFCard();

    /**
     * 往TF卡中写入数据Str
     * @param str
     */
    void writeTFCard(String str);


}
