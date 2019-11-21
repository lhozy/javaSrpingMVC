package com.lhozy.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String,Date>{

    @Override
    public Date convert(String s) {

        if (s == null) {
            throw new RuntimeException("日期为空");
        }
        try {
            DateFormat df;
            if(s.contains("-")){
                df = new SimpleDateFormat("yyyy-MM-dd");
                return df.parse(s);
            }else if(s.contains("/")){
                df = new SimpleDateFormat("yyyy/MM/dd");
                return df.parse(s);
            }else {

                throw new RuntimeException("日期格式错误转换失败");
            }
        } catch (Exception e) {
            throw new RuntimeException("日期格式错误转换失败");
        }
    }
}
