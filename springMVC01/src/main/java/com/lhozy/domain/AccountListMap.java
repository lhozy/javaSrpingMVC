package com.lhozy.domain;

import java.util.List;
import java.util.Map;

public class AccountListMap {
    private String accountName;
    private Double money;
    private String psw;
    List<User> userList;
    Map<String,User> userMap;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "AccountListMap{" +
                "accountName='" + accountName + '\'' +
                ", money=" + money +
                ", psw='" + psw + '\'' +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}
