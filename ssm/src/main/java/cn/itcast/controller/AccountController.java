package cn.itcast.controller;

/**
 * @Author : shi zhao heng
 * @Date :   2021/1/28 15:04
 * @Description :
 */

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 账户web
 *
 * @author shi zhao heng
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户...");
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }


    /**
     * 保存
     * @param account
     * @return
     */
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) {
        accountService.saveAccount(account);
        try {
            response.sendRedirect(request.getContextPath()+"/account/findAll");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
