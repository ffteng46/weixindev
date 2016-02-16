import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.*;

@SuppressWarnings("serial")
public class T1 extends HttpServlet {
    // 自定义 token
    private String TOKEN = "test";

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 随机字符串
        String echostr = request.getParameter("echostr");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        System.out.println("signature=" + signature +";timestamp=" + timestamp +";nonce=" + nonce +";echostr3=" + echostr);
        String[] str = { TOKEN, timestamp, nonce };
        try {
			Arrays.sort(str); // 字典序排序
			String bigStr = str[0] + str[1] + str[2];
			System.out.println("before encoding:"+ bigStr);
			// SHA1加密
			String digest = D1.SHA1(bigStr);
//        String digest = new SHA1().getDigestOfString(bigStr.getBytes()).toLowerCase();
			System.out.println("alter encoding:"+digest);
			// 确认请求来至微信
			if (digest.equals(signature)) {
			    response.getWriter().print(echostr);
			    System.out.println("OK");
			}else{
				System.out.println("ERROR");
			}
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
//        if(bigStr.equals(signature)){
//        	response.getWriter().print(echostr);
//        }
    }
}
