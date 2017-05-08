package java1234.service.impl;

import java1234.dao.UserDao;
import java1234.entity.User;
import java1234.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User getByUserName(String userName) {
        return userDao.getByUserName(userName);
    }

    public Set<String> getRoles(String userName) {
        return userDao.getRoles(userName);
    }

    public Set<String> getPermissions(String userName) {
        return userDao.getPermissions(userName);
    }

}
