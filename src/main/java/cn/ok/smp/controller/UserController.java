package cn.ok.smp.controller;

import cn.ok.smp.domain.User;
import cn.ok.smp.service.UserService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kyou on 2017/11/5 8:52.
 * PACKAGE_NAME: cn.ok.controller
 * PROJECT_NAME: springboot-mybais-pagehelper
 */
@Controller
@RequestMapping(value = "/User")
public class UserController {
    private static final Logger _log = LoggerFactory.getLogger(UserController.class);
    private static int PageSize = 10;

    @Autowired
    UserService userService;          // 用户服务层

    /**
     * 获取用户列表
     * 处理 "/users" 的 GET 请求，用来获取用户列表
     * 通过 @RequestParam 传递参数，进一步实现条件查询或者分页查询
     */
    @RequestMapping()
    public String getUserList(@ModelAttribute User user, ModelMap map) {
        user.setPageSize(PageSize);
        PageInfo<User> pageInfo = new PageInfo<User>(userService.search(user));

        map.addAttribute("pageInfo", pageInfo);
        return "userList";
    }

    /**
     * 显示创建用户表单
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        _log.debug("1111");
        map.addAttribute("user", new User());
        map.addAttribute("action", "create");
        return "userForm";
    }

    /**
     * 创建用户
     * 处理 "/users" 的 POST 请求，用来获取用户列表
     * 通过 @ModelAttribute 绑定参数，也通过 @RequestParam 从页面中传递参数
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        int rtn = userService.insertByUser(user);
        return "redirect:/User/";
    }

    /**
     * 显示需要更新用户表单
     * 处理 "/users/{id}" 的 GET 请求，通过 URL 中的 id 值获取 User 信息
     * URL 中的 id ，通过 @PathVariable 绑定参数
     */
    @RequestMapping(value = "/update/{userId}", method = RequestMethod.GET)
    public String getUser(@PathVariable("userId") int userId, ModelMap map) {
        User user = new User();
        user.setUserId(userId);
        user = userService.search(user).get(0);

        map.addAttribute("user", user);
        map.addAttribute("action", "update");
        return "userForm";
    }

    /**
     * 处理 "/users/{id}" 的 PUT 请求，用来更新 User 信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String putUser(@ModelAttribute User user) {
        int rtn = userService.update(user);
        return "redirect:/User/";
    }

    /**
     * 处理 "/users/{id}" 的 GET 请求，用来删除 User 信息
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable int id) {

        int rtn = userService.delete(id);
        return "redirect:/User/";
    }
}
