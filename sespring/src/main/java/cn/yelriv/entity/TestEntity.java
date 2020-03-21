package cn.yelriv.entity;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Date 2020/1/11 11:17
 * @Created by YR
 */
public class TestEntity {
    private String name;
    private String account;
    private String password;

    public TestEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void echo() {
        System.out.println("echo test");
    }
}
