package com.foodsafety.clientdyexamination.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * The interface Management client.
 *
 * @author shg
 */
@FeignClient(name = "examination", path = "/examination")
public interface ExaminationClient {

}

