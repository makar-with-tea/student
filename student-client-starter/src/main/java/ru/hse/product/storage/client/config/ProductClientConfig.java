package ru.hse.product.storage.client.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "ru.hse.product.storage.client")
public class ProductClientConfig {
}
