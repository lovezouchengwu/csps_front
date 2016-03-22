package com.edot.util;

/**
 * API请求地址
 * Created by tony on 16/2/3.
 */
public class ApiUrls {

    public static final String HOST = "http://localhost:8080";
    
    // 地区
    public static final String BAC_AREA_LIST = HOST + "/bac/area/list";

    public static final String LOGIN = HOST + "/biz/user/login";
    public static final String REGISTER_PERSON = HOST + "/biz/user/register/person";
    public static final String REGISTER_COMPANY = HOST + "/biz/user/register/company";
    
    //政务
    public static final String MSG_GOVERNMENT_LIST = HOST + "/msg/government/list";
    public static final String MSG_GOVERNMENT_VIEW = HOST + "/msg/government/view";

    //图文
    public static final String MSG_INFOMATION_LIST = HOST + "/msg/infomation/list";
    public static final String MSG_INFOMATION_VIEW = HOST + "/msg/infomation/view";
    
    //政策
    public static final String MSG_POLICY_LIST = HOST + "/msg/policy/list";
    public static final String MSG_POLICY_VIEW = HOST + "/msg/policy/view";
}
