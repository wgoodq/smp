package cn.ok.smp.service.impl;

import cn.ok.smp.domain.User;
import cn.ok.smp.mapper.UserMapper;
import cn.ok.smp.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User 业务层实现
 * <p>
 * Created by bysocket on 24/07/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> search(User user) {
        PageHelper.startPage(user.getPageNum(), user.getPageSize());
        return userMapper.doSelect(user);
    }

    public int insertByUser(User user) {
        return userMapper.doInsert(user);
    }

    public int update(User user) {
        return userMapper.doUpdate(user);
    }

    public int delete(int userId) {

        return userMapper.doDelete(userId);
    }
}
