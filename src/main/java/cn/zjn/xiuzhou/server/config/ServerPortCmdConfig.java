package cn.zjn.xiuzhou.server.config;

import java.util.List;
import java.util.Map;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 20:06
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

public class ServerPortCmdConfig {

    int port;
    List<List<Integer>> cmds;
    Map<String,String> meterIds;

    public ServerPortCmdConfig() {
    }

    public ServerPortCmdConfig(int port, List<List<Integer>> cmds, Map<String, String> meterIds) {
        this.port = port;
        this.cmds = cmds;
        this.meterIds = meterIds;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public List<List<Integer>> getCmds() {
        return cmds;
    }

    public void setCmds(List<List<Integer>> cmds) {
        this.cmds = cmds;
    }

    public Map<String, String> getMeterIds() {
        return meterIds;
    }

    public void setMeterIds(Map<String, String> meterIds) {
        this.meterIds = meterIds;
    }

    @Override
    public String toString() {
        return "ServerPortCmdConfig{" +
                "port=" + port +
                ", cmds=" + cmds +
                ", meterIds=" + meterIds +
                '}';
    }
}
