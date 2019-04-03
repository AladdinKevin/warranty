package com.wildcat.warrantyCardMg;

import com.wildcat.warrantyCardMg.domain.Demo;
import com.wildcat.warrantyCardMg.WarrantyCardMgApplicationTests;
import com.wildcat.warrantyCardMg.service.DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceTest extends WarrantyCardMgApplicationTests {

    @Autowired
    private DemoService demoser;

    @Test
    public void demoTest(){
        Demo demo = demoser.getDemo();
        System.out.println(demo.toString());
    }

}
