package com.chenbuer;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class Md5HashTest {

    @Test
    public void test1(){
        String str1 = "st";
        String salt = "buer";
        System.out.println(new Md5Hash(str1,salt));
    }
}
