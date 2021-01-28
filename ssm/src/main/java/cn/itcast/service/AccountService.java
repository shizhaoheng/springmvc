package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @Author : shi zhao heng
 * @Date :   2021/1/28 14:59
 * @Description :
 */
public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存方法
     * @param account
     */
    public void saveAccount(Account account);
}
