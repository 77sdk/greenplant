package com.greenplant.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Created by lenovo on 2020/7/31.
 */
@Data
@Accessors(chain = true)
public class User {
    private Integer USER_ID;
    private Date CREATETIME;
    private String USER_NAME;
    private String PASSWORD;
    private String OPEN_ID;
    private String PHONE_NUM;
    private Date   LAST_LOGIN_TIME;
    private String WEIXIN_NICKNAME;
    private String FIELD1;
    private String FIELD2;
    private String FIELD3;
    private String FIELD4;
    private String FIELD5;
    private String SEX;
    private String PROVINCE;
    private String CITY;
    private String COUNTRY;
    private String HEADIMGURL;
    private String NICK_NAME;



}
