package com.huateng;

public class CheckVerify {
    public static Boolean checkVerify(){
        VerifyLicense vLicense = new VerifyLicense();
        //获取参数
        vLicense.setParam("param.properties");
        //验证证书
        boolean verify = vLicense.verify();

        return verify;
    }
}
