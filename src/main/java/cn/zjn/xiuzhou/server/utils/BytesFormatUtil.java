package cn.zjn.xiuzhou.server.utils;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 10:16
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

public class BytesFormatUtil {


    public static String bytesToHexFun(byte[] bytes,int length) {
        StringBuilder buf = new StringBuilder(bytes.length * 2);
        for(int i=0;i<length;i++){
            buf.append(String.format("%02x ", new Integer(bytes[i] & 0xff)));
        }

        return buf.toString();
    }
}
