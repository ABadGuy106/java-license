package com.huateng;

public class LicenseVerifyTest {
    public static void main(String[] args){
        VerifyLicense vLicense = new VerifyLicense();
        //获取参数
        vLicense.setParam("/param.properties");
        //验证证书
        boolean verify = vLicense.verify();
        System.out.println("验证证书："+verify);
    }
}
