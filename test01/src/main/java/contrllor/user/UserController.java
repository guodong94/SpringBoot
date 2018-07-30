package contrllor.user;

import domain.user.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.user.UserService;

/**
 * Created by Administrator on 2018/7/4.
 */
@RestController
@RequestMapping("/v2/api-docs")
@Api(description = "练习使用")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 添加用户
     * @return
     */
    @ApiOperation(value = "添加用户用户",notes ="添加用户" )
    @RequestMapping(value = "/adduser",method = RequestMethod.GET)
    public String  addUser(){
        userService.addUser();
        return "添加成功";
    }
    @ApiOperation(value = "修改用户用户",notes ="修改用户" )
    @RequestMapping(value = "/insertuser",method = RequestMethod.POST)
    public String  insertUser(User user){
        userService.addUser();
        return "添加成功";
    }

}
