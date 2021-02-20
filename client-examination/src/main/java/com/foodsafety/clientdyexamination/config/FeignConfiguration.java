package com.foodsafety.clientdyexamination.config;

import com.foodsafety.clientdyexamination.feign.ExaminationClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author shg
 */
@Configuration(proxyBeanMethods = false)
@EnableFeignClients(clients = ExaminationClient.class)
public class FeignConfiguration {

}
