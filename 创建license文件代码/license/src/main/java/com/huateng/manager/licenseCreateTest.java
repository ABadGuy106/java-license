package com.huateng.manager;


public class licenseCreateTest {
    public static void main(String[] args){
        CreateLicense cLicense = new CreateLicense();
        //获取参数
        cLicense.setParam("/param.properties");
        //生成证书
        cLicense.create();
    }
}

