package com.mets.weixin.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;
/**
* 类名: MyX509TrustManager </br>
* 描述: 信任管理器 </br>
* 开发人员： TFF </br>
* 创建时间：  2016-2-16 </br>
* 发布版本：V1.0  </br>
 */
public class MyX509TrustManager implements X509TrustManager {
	// 检查客户端证书
	@Override
	public void checkClientTrusted(X509Certificate[] arg0, String arg1)
			throws CertificateException {
		// TODO Auto-generated method stub

	}
	// 检查服务器端证书
	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1)
			throws CertificateException {
		// TODO Auto-generated method stub

	}
	 // 返回受信任的X509证书数组
	@Override
	public X509Certificate[] getAcceptedIssuers() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
