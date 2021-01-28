package cn.itcast.dao;

/**
 * @Author : shi zhao heng
 * @Date :   2021/1/28 14:54
 * @Description :
 */

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户dao接口
 * @author shi zhao heng
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存方法
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
