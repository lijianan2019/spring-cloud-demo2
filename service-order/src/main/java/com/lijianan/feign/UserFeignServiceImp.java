package com.lijianan.feign;

import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceImp implements UserFeignService {
    @Override
    public String getUserNameById(Integer id) {
        return "用户查询失败";
    }
}
