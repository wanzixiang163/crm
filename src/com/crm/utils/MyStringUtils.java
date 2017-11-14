package com.crm.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyStringUtils {
    public static String getMd5Value(String value) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] md5ValueArray = messageDigest.digest(value.getBytes());  //加密的结果10进制
            BigInteger bigInteger = new BigInteger(1,md5ValueArray); //将10进制 转换16进制
            return bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            //e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
