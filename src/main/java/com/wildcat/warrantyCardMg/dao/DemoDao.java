package com.wildcat.warrantyCardMg.dao;

import com.wildcat.warrantyCardMg.domain.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DemoDao {
    @Select("select * from demo")
    Demo queryDemo();
}
