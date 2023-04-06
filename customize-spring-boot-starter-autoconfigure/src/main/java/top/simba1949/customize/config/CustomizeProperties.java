package top.simba1949.customize.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anthony
 * @date 2023/4/6
 */
@ConfigurationProperties("top.simba1949.customize")
public class CustomizeProperties {

    private String configParamOne = "one"; // 为参数设置默认值
    private String configParamTwo = "two"; // 为参数设置默认值

    public String getConfigParamOne() {
        return configParamOne;
    }

    public void setConfigParamOne(String configParamOne) {
        this.configParamOne = configParamOne;
    }

    public String getConfigParamTwo() {
        return configParamTwo;
    }

    public void setConfigParamTwo(String configParamTwo) {
        this.configParamTwo = configParamTwo;
    }

    @Override
    public String toString() {
        return "CustomizeProperties{" +
                "configParamOne='" + configParamOne + '\'' +
                ", configParamTwo='" + configParamTwo + '\'' +
                '}';
    }
}
