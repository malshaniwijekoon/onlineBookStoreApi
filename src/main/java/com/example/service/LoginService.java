package com.example.service;

import com.example.dao.LoginDao;
import com.example.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoginService {

    @Autowired
    LoginDao loginDao;

    public String login(User user){
        List<User> loginUser = loginDao.findByUserName(user.getUserName());

        if(loginUser != null){
            return "SUCCESS";
        } else {
            return "FAILURE";
        }
    }
}
