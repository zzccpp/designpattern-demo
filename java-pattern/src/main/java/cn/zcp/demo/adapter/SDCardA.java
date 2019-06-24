package cn.zcp.demo.adapter;

/**
 * @author zhongchunping
 * @version 1.0
 * @Time 2019-06-24 18:21
 * @describe designpattern-demo <描述>
 */
public class SDCardA implements SDCard {
    @Override
    public String readSD() {
        System.out.println("读取 sdcardA 中的数据.");
        return "sdcardA-data";
    }

    @Override
    public void writeSD(String str) {

        System.out.println("往sdcarA中写入数据:"+str);
    }
}
