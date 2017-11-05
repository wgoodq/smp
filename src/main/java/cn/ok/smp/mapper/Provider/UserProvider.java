package cn.ok.smp.mapper.Provider;

import cn.ok.smp.domain.User;
import com.google.common.base.Strings;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * Created by Kyou on 2017/11/5 9:04.
 * PACKAGE_NAME: cn.ok.mapper.Provider
 * PROJECT_NAME: springboot-mybais-pagehelper
 */
public class UserProvider {
    public String doSelect(@Param("user") User user) {
        SQL sql = new SQL();
        sql.SELECT("[USER_ID]", "[USER_NAME]", "[PASSWORD]");
        sql.FROM("[USER]");
        if (!Strings.isNullOrEmpty(user.getUserName())) {
            sql.WHERE("[USER_NAME] = #{user.userName}");
        }
        if (user.getUserId() != 0) {
            sql.WHERE("[USER_ID] = #{user.userId}");
        }
        return sql.toString();
    }
}
