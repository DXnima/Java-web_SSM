package ssm.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.demo.dao.UserMapper;
import ssm.demo.entity.User;
import ssm.demo.service.IUserService;

/**
 * Created by cyan on 16/3/31.
 */

@Service("userService")
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserByName(String name) {
        return userMapper.selectUserByUsername(name).get(0);
    }

    @Override
    public boolean verify(String username, String pwd) {
        if(userMapper.selectUserByUsername(username).get(0).getPassword().equals(pwd))
            return true;
        else return false;
    }

}
