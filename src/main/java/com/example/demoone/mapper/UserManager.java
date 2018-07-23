package com.example.demoone.mapper;

import com.example.demoone.pojo.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserManager {
    @Select("SELECT * FROM t_user")
    List<TUser> getUserList();
}
