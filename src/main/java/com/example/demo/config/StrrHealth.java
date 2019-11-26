package com.example.demo.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class StrrHealth implements HealthIndicator {
    @Override
    public Health health() {
        return Health.status("FATAL").withDetail("msg", "网络连接正常").build();
    }
}
