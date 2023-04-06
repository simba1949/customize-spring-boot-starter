package top.simba1949.customize.auto;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.simba1949.customize.config.CustomizeProperties;
import top.simba1949.customize.service.CustomizeService;

/**
 * @author anthony
 * @date 2023/4/6
 */
@Configuration
@EnableConfigurationProperties(CustomizeProperties.class)  // 启动配置，同时也会将其放入到spring容器中
public class CustomizeServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(CustomizeService.class)
    public CustomizeService customizeService(){
        return new CustomizeService();
    }
}
