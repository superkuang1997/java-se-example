package webhook;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

/**
 * @Classname Webhook.webhook
 * @Description TODO
 * @date 2020/11/19 4:33 下午
 * @author by yorua
 */
public class webhook {
    public static void main(String[] args) throws Exception {
        String url = "https://open.feishu.cn/open-apis/bot/v2/hook/4e042ea0-1e38-4b5b-8e54-d2b1230fee80";
        String secret = "OtkAFD0VBl1ZUqiMkARKyg";
        long timestamp = System.currentTimeMillis();
        String string2sign = timestamp + "\n" + secret;

        System.out.println(string2sign);
        String sha265Str = Sha265Utils.HMACSHA256(string2sign, secret);
        Base64.encode(sha265Str.getBytes());
    }
}
