package com.lhozy.controller;

import com.lhozy.domain.Account;
import com.lhozy.domain.AccountDate;
import com.lhozy.domain.AccountListMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(path = "/saveAccount",method = RequestMethod.POST)
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "/saveAccountListMap",method = RequestMethod.POST)
    public String saveAccountListMap(AccountListMap accountListMap){
        System.out.println(accountListMap);
        return "success";
    }

    @RequestMapping(path = "/saveAccountDate",method = RequestMethod.POST)
    public String saveAccountDate(AccountDate accountDate){
        System.out.println(accountDate);
        return "success";
    }
}
