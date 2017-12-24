package cn.zjn.xiuzhou.server.dao;

import cn.zjn.xiuzhou.server.domain.PowerMeterAllValue;
import org.springframework.data.repository.Repository;


/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 18:20
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

public interface PowerMeterValueRepository  extends Repository<PowerMeterAllValue,Long>{
    public void save(PowerMeterAllValue powerMeterAllValue);
}
