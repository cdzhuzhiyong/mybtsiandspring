package edu.swpu.spring_mybatis;

import edu.swpu.spring_mybatis.bean.User;
import edu.swpu.spring_mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class Test1 {
    @Resource
    private UserService userService;
    @Test
    public void test(){
        User user = new User();
        user.setName("zzy");
        List<User> userList = userService.selectEntryList(user);
        System.out.println(userList);
    }
}
