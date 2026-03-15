package com.aizuda.snailjob.server.common.config;

import com.aizuda.snailjob.common.core.util.JsonUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import tools.jackson.databind.ObjectMapper;

/**
 * @Author: opensnail
 * @Date: 2018/09/27 12:52
 */
@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper jacksonObjectMapper() {
        return JsonUtil.JsonMapper.jacksonObjectMapper();
    }

}
