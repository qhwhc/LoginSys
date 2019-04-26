package com.ccc.loginsys.interfaces;


public interface UserInterface {
    /**
     * 用户注册接口
     *
     * @param usercode 帐号
     * @param username 姓名
     * @param password 密码
     **/
    public String Register(String usercode, String username, String password);

    /**
     * 修改密码接口
     */
    public String modifyPassWd(String username, String oldPassword, String newPassword);
}
