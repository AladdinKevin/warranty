package com.wildcat.warrantyCardMg.service.Impl;

import com.wildcat.warrantyCardMg.dao.DemoDao;
import com.wildcat.warrantyCardMg.domain.Demo;
import com.wildcat.warrantyCardMg.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoDao demoDao;

    @Override
    public Demo getDemo() {
        Demo demo = demoDao.queryDemo();
        return demo;
    }
}
