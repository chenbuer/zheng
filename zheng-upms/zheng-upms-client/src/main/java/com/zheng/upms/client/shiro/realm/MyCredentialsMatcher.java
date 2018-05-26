package com.zheng.upms.client.shiro.realm;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * 要是自实现的realm中的doGetAuthenticationInfo方法没有判断密码，可以注入这个CredentialsMatcher到realm的bean中去实现密码的判断
 * Created by czy on 2017/1/20.
 */
public class MyCredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String password = String.valueOf(usernamePasswordToken.getPassword());
        String dbpassword = (String) info.getCredentials();
        return this.equals(password, dbpassword);
    }
}