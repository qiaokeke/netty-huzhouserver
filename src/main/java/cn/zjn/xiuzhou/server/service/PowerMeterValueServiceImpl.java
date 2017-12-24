package cn.zjn.xiuzhou.server.service;

import cn.zjn.xiuzhou.server.dao.PowerMeterValueRepository;
import cn.zjn.xiuzhou.server.domain.PowerMeterAllValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: qiao
 * @Description:
 * @Date: Created in 2017-12-23 19:00
 * @Modified By:
 * @Email: qiaokekeshu@163.com
 */

@Service
@Transactional
public class PowerMeterValueServiceImpl implements PowerMeterValueService {

    @Autowired
    private  PowerMeterValueRepository repository;

    @Override
    public void save(PowerMeterAllValue powerMeterAllValue) {
        repository.save(powerMeterAllValue);
    }
}
