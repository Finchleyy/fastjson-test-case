package com.ypw.fastjson.controller;

import com.ypw.fastjson.module.TestBO;
import com.ypw.fastjson.module.TestBasicBO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yupengwu
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public TestBasicBO test() {
        return new TestBasicBO();
    }
}
