package DAO.impl;

import DAO.BaseDao;
import DAO.SysUserDao;
import pojo.SysUser;

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
        String sql="insert into sys_user values(DEFAULT,?,?)";
        return baseUpdate(sql,user.getUsername(),user.getUserPwd());
    }
}
