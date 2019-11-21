package com.lhozy.domain;

import java.util.Date;

public class AccountDate {
    private String accountName;
    private Double money;
    private String psw;
    private Date date;

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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AccountDate{" +
                "accountName='" + accountName + '\'' +
                ", money=" + money +
                ", psw='" + psw + '\'' +
                ", date=" + date +
                '}';
    }
}
