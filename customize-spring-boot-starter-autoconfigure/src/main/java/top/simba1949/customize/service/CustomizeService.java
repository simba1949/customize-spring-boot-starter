package top.simba1949.customize.service;

import org.springframework.beans.factory.annotation.Autowired;
import top.simba1949.customize.config.CustomizeProperties;

/**
 * @author anthony
 * @date 2023/4/6
 */
public class CustomizeService {

    @Autowired
    private CustomizeProperties customizeProperties;

    public String getConfig(){
        return "参数1：" + customizeProperties.getConfigParamOne() +
                "参数2：" +  customizeProperties.getConfigParamTwo();
    }
}
