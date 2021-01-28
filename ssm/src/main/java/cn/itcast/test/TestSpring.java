package cn.itcast.test;


import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author : shi zhao heng
 * @Date :   2021/1/28 15:13
 * @Description :
 */
public class TestSpring {
    @Test
    public void run1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService as = (AccountService) ac.getBean("accountService");

        as.findAll();

    }
}
