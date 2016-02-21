package com.mets.weixin.test;

import com.mets.weixin.pojo.Token;
import com.mets.weixin.util.CommonUtil;
/**
 * appid ：wxa54a7eeaa6439311
secret ：5eab4db4b6919eb3af7e9016530f4fda
 */

public class TokenTest {
  public static void main(String[] args) throws Exception {
  //修改appID，secret
    String appid="wxa54a7eeaa6439311";
    String appsecret="5eab4db4b6919eb3af7e9016530f4fda";
    Token token = CommonUtil.getToken(appid, appsecret);
    //输出返回结果
    System.out.println(token.getAccessToken()+";\r\nexpire=" + token.getExpiresIn());
  }
}
