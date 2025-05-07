package service.impl;

import DAO.impl.SysUserDaoImpl;
import pojo.SysUser;
import service.SysScheduleService;
import service.SysUserService;
import util.MD5Util;

/**
 *ClassName: SysScheduleServiceImpl
 *Package: service.impl
 *Description:创建于 2025/5/7 17:08
 *@Author lyl
 *@Version 1.0
 */
public class SysUserServiceImpl implements SysUserService {
    private SysUserDaoImpl userDao = new SysUserDaoImpl();

    @Override
    public int regist (SysUser user) {
        user.setUserPwd(MD5Util.encrypt(user.getUserPwd()));
        return userDao.add(user);
    }
}
