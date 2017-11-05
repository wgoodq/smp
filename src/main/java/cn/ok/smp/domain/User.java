package cn.ok.smp.domain;

/**
 * Created by Kyou on 2017/11/5 8:49.
 * PACKAGE_NAME: cn.ok.domain
 * PROJECT_NAME: springboot-mybais-pagehelper
 */
public class User extends BaseDomain {
    private int userId = 0;
    private String userName;
    private String password;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
