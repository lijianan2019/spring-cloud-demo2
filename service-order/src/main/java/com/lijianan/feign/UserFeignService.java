package com.lijianan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-user",fallback = UserFeignServiceImp.class)
public interface UserFeignService {

    @RequestMapping("/user/getUserNameById")
    public String getUserNameById(@RequestParam("id") Integer id);
}
