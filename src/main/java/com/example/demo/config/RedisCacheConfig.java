package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisCacheConfig {
    @Resource
    private JedisConnectionFactory factory;

    @Bean
    public RedisCacheManager redisCacheManager() {
        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .prefixKeysWith("book_cache:")
                .disableCachingNullValues()
                .entryTtl(Duration.ofMinutes(30));
        configMap.put("c1", redisCacheConfiguration);
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(factory);
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter,
                RedisCacheConfiguration.defaultCacheConfig(),
                configMap);
        return redisCacheManager;
    }
}
