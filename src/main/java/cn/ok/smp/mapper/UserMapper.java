package cn.ok.smp.mapper;

import cn.ok.smp.domain.User;
import cn.ok.smp.mapper.Provider.UserProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Kyou on 2017/11/5 8:55.
 * PACKAGE_NAME: cn.ok.mapper
 * PROJECT_NAME: springboot-mybais-pagehelper
 */
@Mapper
public interface UserMapper {

    @SelectProvider(type = UserProvider.class, method = "doSelect")
    @Results(id = "userResult", value = {
            @Result(property = "userId", column = "USER_ID"),
            @Result(property = "userName", column = "USER_NAME")
    })
    List<User> doSelect(@Param("user") User user);

    @Insert("INSERT INTO [USER] ([USER_NAME],[PASSWORD]) VALUES (#{user.userName},#{user.password})")
    int doInsert(@Param("user") User user);

    @Update("UPDATE [USER] SET [USER_NAME] = #{user.userName}, [PASSWORD] = #{user.password} WHERE [USER_ID] = #{user.userId}")
    int doUpdate(@Param("user") User user);

    @Delete("DELETE FROM [USER] WHERE [USER_ID] = #{userId}")
    int doDelete(int userId);
}
