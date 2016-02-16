import java.util.Arrays;

import org.apache.commons.codec.digest.DigestUtils;


public class t2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 微信加密签名
        String signature = "";
        // 随机字符串
        String echostr = "5976601011923450831";
        // 时间戳
        String timestamp = "1455549249";
        // 随机数
        String nonce = "253064599";
        System.out.println("signature=" + signature +";timestamp=" + timestamp +";nonce=" + nonce +";echostr=" + echostr);
        String[] str = { "test", timestamp, nonce };
        Arrays.sort(str); // 字典序排序
        String bigStr = str[0] + str[1] + str[2];
        // SHA1加密
        String digest = DigestUtils.sha1Hex(bigStr);
        System.out.println(digest);
	}

}
