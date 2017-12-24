package cn.zjn.xiuzhou.server.utils;

import cn.zjn.xiuzhou.server.dao.PowerMeterValueRepository;
import cn.zjn.xiuzhou.server.domain.PowerMeterAllValue;
import cn.zjn.xiuzhou.server.service.PowerMeterValueService;
import io.netty.buffer.ByteBuf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 16:36
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */
@Component
@Transactional
public class DataParseUtil {



    public static Map<Integer,PowerMeterAllValue> powerMeterAllValueMap = new HashMap<>();


    public static void addPowerMeter68Value(ByteBuf byteBuf){
        int P_CODE = byteBuf.readByte();
        byteBuf.readBytes(4);
        PowerMeterAllValue powerMeterAllValue = null;
        if(powerMeterAllValueMap.get(P_CODE)==null){
            powerMeterAllValue = new PowerMeterAllValue();
            powerMeterAllValueMap.put(P_CODE,powerMeterAllValue);
        }else {
            powerMeterAllValue = powerMeterAllValueMap.get(P_CODE);
        }

        powerMeterAllValue.setP_CODE(P_CODE);
        powerMeterAllValue.setP_A_DIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_B_DIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_C_DIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_UAB_XIANDIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_UBC_XIANDIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_UCA_XIANDIANYA(byteBuf.readFloat());
        powerMeterAllValue.setP_A_DIANLIU(byteBuf.readFloat());
        powerMeterAllValue.setP_B_DIANLIU(byteBuf.readFloat());
        powerMeterAllValue.setP_A_YGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_B_YGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_C_YGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_HXYGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_A_WGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_B_WGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_C_WGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_HXWGGL(byteBuf.readFloat());
        powerMeterAllValue.setP_A_SZGL(byteBuf.readFloat());
        powerMeterAllValue.setP_B_SZGL(byteBuf.readFloat());
        powerMeterAllValue.setP_C_SZGL(byteBuf.readFloat());
        powerMeterAllValue.setP_HXSZGL(byteBuf.readFloat());
        powerMeterAllValue.setP_A_GLYS(byteBuf.readFloat());
        powerMeterAllValue.setP_B_GLYS(byteBuf.readFloat());
        powerMeterAllValue.setP_C_GLYS(byteBuf.readFloat());
        powerMeterAllValue.setP_HXGLYS(byteBuf.readFloat());
        powerMeterAllValue.setP_DWPL(byteBuf.readFloat());


    }

    public static void addPowerMeterF0Value(ByteBuf byteBuf){
        int P_CODE = byteBuf.readByte();
        byteBuf.readBytes(4);
        PowerMeterAllValue powerMeterAllValue = null;
        if(powerMeterAllValueMap.get(P_CODE)==null){
            powerMeterAllValue = new PowerMeterAllValue();
            powerMeterAllValueMap.put(P_CODE,powerMeterAllValue);
        }else {
            powerMeterAllValue = powerMeterAllValueMap.get(P_CODE);
        }
        powerMeterAllValue.setP_BY_KwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_KvarhG(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_BY_HKvarhG(byteBuf.readFloat());

        powerMeterAllValue.setP_SY_KwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_KvarhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SY_HKvarhG(byteBuf.readFloat());

        powerMeterAllValue.setP_SSY_KwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKwhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKwhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKwhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKwhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKwhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_KvarhG(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKvarhZ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKvarhJ(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKvarhF(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKvarhP(byteBuf.readFloat());
        powerMeterAllValue.setP_SSY_HKvarhG(byteBuf.readFloat());

    }

    public static PowerMeterAllValue addPowerMeter10Value(ByteBuf byteBuf){
        int P_CODE = byteBuf.readByte();
        byteBuf.readBytes(4);
        PowerMeterAllValue powerMeterAllValue = null;
        if(powerMeterAllValueMap.get(P_CODE)==null){
            powerMeterAllValue = new PowerMeterAllValue();
            powerMeterAllValueMap.put(P_CODE,powerMeterAllValue);
        }else {
            powerMeterAllValue = powerMeterAllValueMap.get(P_CODE);
        }

        powerMeterAllValue.setP_ZXYGDN((float) byteBuf.readInt()/1000);
        powerMeterAllValue.setP_FXYGDN((float) byteBuf.readInt()/1000);
        powerMeterAllValue.setP_ZXWGDN((float) byteBuf.readInt()/1000);
        powerMeterAllValue.setP_FXWGDN((float) byteBuf.readInt()/1000);

        return powerMeterAllValue;

    }


    /**
     *遍历map中的数据
     */
    public static void printPowerMeterAllValueMap(){
        for(Integer key:powerMeterAllValueMap.keySet()){
            PowerMeterAllValue powerMeterAllValue =  powerMeterAllValueMap.get(key);

            System.out.println("key:"+key+",value="+powerMeterAllValue.toString());
        }


    }

    public static void savePowerMeterAllValue(){

    }


}
