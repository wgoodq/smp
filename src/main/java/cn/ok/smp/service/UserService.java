package cn.ok.smp.service;


import cn.ok.smp.domain.User;

import java.util.List;

/**
 * User 业务层接口
 *
 * Created by bysocket on 24/07/2017.
 */
public interface UserService {

    List<User> search(User user);

    int insertByUser(User user);

    int update(User user);

    int delete(int id);
}
