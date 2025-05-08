package DAO.impl;

import DAO.BaseDao;
import DAO.SysUserDao;
import pojo.SysUser;

import java.util.List;

/**
 *ClassName: SysUserDaoImpl
 *Package: DAO.impl
 *Description:创建于 2025/5/7 12:54
 *@Author lyl
 *@Version 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int add (SysUser user) {
        String sql = "insert into sys_user values(DEFAULT,?,?)";
        return baseUpdate(sql , user.getUsername() , user.getUserPwd());
    }

    @Override
    public SysUser findByName (String username) {
        String sql = "select uid,username,user_pwd userPwd from sys_user where username=?";
        List<SysUser> list = baseQuery(SysUser.class , sql , username);
        return (list != null && list.size() > 0) ? list.get(0) : null;
    }
}
