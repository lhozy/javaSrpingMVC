package com.lhozy.domain;

public class Account {
    private String accountName;
    private Double money;
    private String psw;
    User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", money=" + money +
                ", psw='" + psw + '\'' +
                ", user=" + user +
                '}';
    }
}
