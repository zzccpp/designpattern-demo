package cn.zcp.demo.adapter;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 18:18
 * @describe designpattern-demo
 *
 * 定义电脑的SD卡接口
 */
public interface SDCard {

    /**
     * 读取SD内容
     * @return
     */
    String readSD();

    /**
     * 往SD卡中写入信息
     * @param str
     */
    void writeSD(String str);
}
