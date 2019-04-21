package ssm.demo.service;

import ssm.demo.entity.User;

public interface IUserService {
    public User getUserByName(String name);
    public boolean verify(String username, String pwd);
}
