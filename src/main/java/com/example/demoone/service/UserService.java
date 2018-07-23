package com.example.demoone.service;

import com.example.demoone.mapper.UserManager;
import com.example.demoone.pojo.IService.IUserService;
import com.example.demoone.pojo.TUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service
public class UserService implements IUserService {
    @Resource
    private UserManager userManager;

    @Override
    public List<TUser> getUserList() {
        return userManager.getUserList();
    }
}
