package com.ypw.fastjson.test.controller;

import com.ypw.fastjson.controller.TestController;
import com.ypw.fastjson.module.TestBasicBO;
import com.ypw.fastjson.test.BasicsApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestClass extends BasicsApplicationTests {
    @Autowired
    TestController testController;

    /*@Test
    public void test() {
        TestBasicBO test = testController.test();
        System.out.println(test);
    }*/
}
